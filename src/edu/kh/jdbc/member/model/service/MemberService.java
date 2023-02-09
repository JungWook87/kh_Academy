package edu.kh.jdbc.member.model.service;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.common.JDBCTemplate;
import static edu.kh.jdbc.common.JDBCTemplate.*;

import edu.kh.jdbc.member.model.dao.MemberDAO;
import edu.kh.jdbc.member.vo.Member;


/**
 * @author Jungwook
 *
 */
public class MemberService {

	private MemberDAO dao = new MemberDAO();
	
	
	private Connection conn = null;
	
	
	
	/** 내 정보 조회 서비스
	 * @param loginMember
	 */
	public Member selectMyInfo(Member loginMember) {
		
		conn = getConnection();
		
		Member mem = dao.selectMyInfo(conn, loginMember);

		close(conn);
		
		return mem;
		
	}


	/** 회원 목록 조회 서비스
	 * @param loginMember
	 */
	public List<Member> selectAll(Member loginMember) {
		
		conn = getConnection();
		
		List<Member> memList = dao.selectAll(conn, loginMember);
		
		close(conn);
		
		return memList;
	}


	

	/** 내 정보 수정(이름, 성별) 서비스
	 * @param loginMember
	 * @param inputName
	 * @param inputGender
	 * @return result
	 */
	public int updateMember(Member loginMember, String inputName, String inputGender) {
		conn = getConnection();
		
		int result = dao.updateMember(conn, loginMember, inputName, inputGender);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	
	
	/** 비밀번호 변경 서비스
	 * @param loginMember
	 * @param pw1
	 * @return result
	 */
	public int updatePw(Member loginMember, String pw1) {

		conn = getConnection();
		
		int result = dao.updatePw(conn, loginMember, pw1);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	/** 회원탈퇴 서비스
	 * @param loginMember
	 * @return result
	 */
	public int secession(Member loginMember) {
		int result= 0;
		
		conn = getConnection();
		
		result = dao.secession(conn, loginMember);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
