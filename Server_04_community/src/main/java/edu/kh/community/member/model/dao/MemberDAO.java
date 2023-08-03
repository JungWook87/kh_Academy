package edu.kh.community.member.model.dao;

import static edu.kh.community.common.JDBCTemplate.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.community.member.model.vo.Member;

public class MemberDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public MemberDAO() {
		try {
			prop = new Properties();
			
			String filePath = MemberDAO.class.getResource("/edu/kh/community/sql/member-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 회원 정보 조회 DAO
	 * @param conn
	 * @param memberEmail
	 * @return member
	 */
	public Member selectOne(Connection conn, String memberEmail) throws Exception{
		Member member = null;
		
		try {
			String sql = prop.getProperty("selectOne");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberEmail);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { // 조회 결과가 있는 경우
				member = new Member();
				
				member.setMemberEmail( rs.getString(1) );
				member.setMemberNickname( rs.getString(2) );
				member.setMemberTel( rs.getString(3) );
				member.setMemberAddress( rs.getString(4) );
				member.setEnrollDate( rs.getString(5) );
			}
			
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return member;
	}

	/** 인증번호, 발급일 수정 DAO
	 * @param conn
	 * @param inputEmail
	 * @param cNumber
	 * @return
	 */
	public int updateCertification(Connection conn, String inputEmail, String cNumber) throws Exception{
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("updateCertification");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, cNumber);
			pstmt.setString(2, inputEmail);
			
			result = pstmt.executeUpdate();
			
			
		} finally {
			close(pstmt);
		}
		return result;
	}

	/** 인증번호 생성 DAO
	 * @param conn
	 * @param inputEmail
	 * @param cNumber
	 * @return result
	 */
	public int insertCertification(Connection conn, String inputEmail, String cNumber) throws Exception{
		int result = 0;
		
		try {
			String sql = prop.getProperty("insertCertification");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, inputEmail);
			pstmt.setString(2, cNumber);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 멤버 전체 조회 DAO
	 * @param conn
	 * @return memberList
	 * @throws Exception
	 */
	public List<Member> selectAll(Connection conn) throws Exception {
		List<Member> memberList = new ArrayList<>();
		try {
			String sql = prop.getProperty("selectAll");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int memberNo = rs.getInt("MEMBER_NO");
				String memberEmail = rs.getString("MEMBER_EMAIL");
				String memberNickname = rs.getString("MEMBER_NICK");
				
				Member member = new Member();
				
				member.setMemberNo(memberNo);
				member.setMemberEmail(memberEmail);
				member.setMemberNickname(memberNickname);
				
				memberList.add(member);
			}
			
		} finally {
			close(rs);
			close(stmt);
		}
		return memberList;
	}

}
