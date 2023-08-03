package edu.kh.jdbc.main.service;

import java.sql.Connection;

import edu.kh.jdbc.main.dao.MainDAO;
import edu.kh.jdbc.member.vo.Member;
import static edu.kh.jdbc.common.JDBCTemplate.*;

// Service : 데이터 가공, 트랜잭션 제어 처리
public class MainService {
	
	private MainDAO dao = new MainDAO();
	
	
	/** 로그인 서비스
	 * @param memberId
	 * @param memberPw
	 * @return loginMember
	 */
	public Member login(String memberId, String memberPw) throws Exception {
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 메서드 호출 후 결과 반환 받기
		Member loginMember = dao.login(conn, memberId, memberPw);
		
		// 3. 커넥션 반환
		close(conn);
		
		// 4. 조회 결과 반환
		return loginMember;
	}


	/** 아이디 중복 검사 서비스
	 * @param memberId
	 * @return result
	 * @exception Exception
	 */
	public int idDupCheck(String memberId) throws Exception {
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 메서드 호출 후 결과 반환 받기
		int result = dao.idDupCheck(conn, memberId);
		
		// 3. 커넥션 반환
		close(conn);
		
		return result;
	}


	/** 회원 가입 서비스
	 * @param member
	 * @return result
	 * @exception Exception
	 */
	public int signUp(Member member) throws Exception {
		Connection conn = getConnection();
		
		int result = dao.signUp(conn, member);
		
		if(result > 0) commit(conn);
		else rollback(conn);

		close(conn);

		return result;
	}

}
