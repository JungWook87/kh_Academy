package edu.kh.comm.member.model.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.comm.member.model.vo.Member;

@Repository
public class MyPageDAO {
	
	private Logger logger = LoggerFactory.getLogger(MyPageDAO.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	// 회원 정보 수정
//	public int updateInfo(Member loginMember) {
//		
//		return sqlSession.update("myPageMapper.updateInfo", loginMember);
//	}
	public int updateInfo(Map<String, Object> paramMap) {
		return sqlSession.update("myPageMapper.updateInfo", paramMap);
	}

	// 비밀번호 확인
	public String pwCheck(int memberNo) {
		
		return sqlSession.selectOne("myPageMapper.pwCheck" , memberNo);
	}

	// 비밀번호 변경
	public int changePw(Map<String, Object> paramMap) {
		return sqlSession.update("myPageMapper.changePw", paramMap);
	}

	// 회원 탈퇴
	public int secession(int memberNo) {
		return sqlSession.update("myPageMapper.secession", memberNo);
	}

	/** 프로필 이미지 수정
	 * @param map
	 * @return result
	 */
	public int updateProfile(Map<String, Object> map) {

		return sqlSession.update("myPageMapper.updateProfile", map);
	}




}
