package edu.kh.jdbc.main.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import static edu.kh.jdbc.common.JDBCTemplate.*;

import edu.kh.jdbc.member.vo.Member;

public class MainDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	// Map<String, String> 제한, XML 파일 읽고/쓰는데 특화
	
	public MainDAO() {
		try {
			// Properties 객체 생성
			prop = new Properties();
			
			prop.loadFromXML(new FileInputStream("main-query.xml"));
			// main-query.xml 파일의 내용을 읽어와 Properties 객체에 저장
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	/** 로그인 DAO
	 * @param conn
	 * @param memberId
	 * @param memberPw
	 * @return loginMember
	 */
	public Member login(Connection conn, String memberId, String memberPw) throws Exception {
		
		// 1. 결과 저자용 변수 선언
		Member loginMember = null;
		
		
		try {
			// 2. SQL 얻어오기 (main-query.xml 파일에 작성된 SQL)
			String sql = prop.getProperty("login");

			// 3. PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// 4. ? 에 알맞은 값 대입
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPw);
			
			// 5. SQL(SELECT) 수행 결과(ResultSet) 반환 받기
			rs = pstmt.executeQuery();
			
			// 6. 조회 결과가 있을 경우
			//	  컬럼값을 모두 얻어와
			//	  Member 객체를 생성해서 loginMember대입
			if(rs.next()) {
				loginMember = new Member(rs.getInt("MEMBER_NO"), memberId, rs.getString("MEMBER_NM"),
						rs.getString("MEMBER_GENDER"), rs.getString("ENROLL_DATE"));
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}

		return loginMember;
	}


	/** 아이디 중복 검사 DAO
	 * @param conn
	 * @param memberId
	 * @return result
	 * @exception Exception
	 */
	public int idDupCheck(Connection conn, String memberId) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("idDupCheck");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			rs = pstmt.executeQuery();
			
			// COUNT(*)
			//		 1
			
			if(rs.next())
			result = rs.getInt("COUNT(*)");
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		
		return result;
	}


	/** 회원 가입 DAO
	 * @param conn
	 * @param member
	 * @return result
	 * @exception Exception
	 */
	public int signUp(Connection conn, Member member) throws Exception{
		int result = 0;
		
		try {
			String sql = prop.getProperty("signUp");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberGender());
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
