package edu.kh.comm.member.model.service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import edu.kh.comm.common.Util;
import edu.kh.comm.member.model.dao.MyPageDAO;
import edu.kh.comm.member.model.vo.Member;

@Service
public class MyPageServiceImpl implements MyPageService {
	
	@Autowired
	private MyPageDAO dao;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;

	// 회원 정보 수정
//	@Override
//	public int updateInfo(Member loginMember) {
//		return dao.updateInfo(loginMember);
//	}
	@Override
	public int updateInfo(Map<String, Object> paramMap) {
		return dao.updateInfo(paramMap);
	}



	// 비밀번호 변경
	@Override
	public int changePw(Map<String, Object> paramMap) {
		int result = 0;
		
		String DBPw = dao.pwCheck((int)paramMap.get("memberNo"));
		
		if(bcrypt.matches((String)paramMap.get("currentPw"), DBPw)) {
			
			String newPwBcrypt = bcrypt.encode((String)paramMap.get("newPw"));
			
			paramMap.put("newPw", newPwBcrypt);
			// Map 특성 : 키값이 같은게 있으면 값을 덮어 씌운다
			
			result = dao.changePw(paramMap);
		}
		
		return result;
	}

	// 회원 탈퇴
	@Override
	public int secession(Member loginMember) {
		
		int result = 0;
		
		// 비밀번호 확인
		String DBPw = dao.pwCheck(loginMember.getMemberNo());
		
		if(bcrypt.matches(loginMember.getMemberPw(), DBPw)) {
			result = dao.secession(loginMember.getMemberNo());
		} else {
			result = -1;
		}
		
		return result;
		
	}

	// 프로필 이미지 수정 서비스 구현
	@Override
	public int updateProfile(Map<String, Object> map) throws IOException {
						// webPath, folderPath, uploadImage, delete memberNo
		
		// 자주 쓰는 값 변수에 저장
		MultipartFile uploadImage = (MultipartFile)map.get("uploadImage");
		String delete = (String)map.get("delete"); // "0" (변경) / "1" (삭제)
		
		// 프로필 이미지 삭제여부를 확인해서
		// 삭제가 아닌 경우 (== 새 이미지로 변경) -> 업로드된 파일명을 변경한다
		// 삭제가 된 경우 -> NULL 값을 준비 (DB update)
		
		String renameImage = null; // 변경된 파일명 저장
		
		if(delete.equals("0")) { // 이미지가 변경된 경우
			
			// 파일명 변경
			// uploadImage.getOriginalFilename() : 원본 파일명
			renameImage = Util.fileRename(uploadImage.getOriginalFilename());
			// 2023042815432.png
			
			map.put("profileImage", map.get("webPath") + renameImage);
			// /resources/images/memberProfile/2023042815432.png
			
		} else {
			map.put("profileImage", null);
		}
		
		// DAO를 호출해서 프로필 이미지 수정
		int result = dao.updateProfile(map);
		
		// DB 수정 성공 시 메모리에 임시 저장되어있는 파일을 서버에 저장
		if(result > 0 && map.get("profileImage") != null) {
			uploadImage.transferTo( new File(map.get("folderPath") + renameImage ));
		}
		
		return result;
	}
	
	
	
	
	
	
	
}
