package edu.kh.community.member.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import static edu.kh.community.common.JDBCTemplate.*;
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
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 회원 조회 DAO
	 * @param conn
	 * @param memberEmail
	 * @return member
	 */
	public Member selectOne(Connection conn, String memberEmail) throws Exception {
		
		Member member = new Member();
		
		String sql = prop.getProperty("selectOne");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberEmail);
			
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String memberNickname = rs.getString("MEMBER_NICK");
				String memberTel = rs.getString("MEMBER_TEL");
				String memberAddress = rs.getString("MEMBER_ADDR");
				String enrollDate = rs.getString("ENROLL_DATE");
				
				member.setMemberEmail(memberEmail);
				member.setMemberNickname(memberNickname);
				member.setMemberTel(memberTel);
				member.setMemberAddress(memberAddress);
				member.setEnrollDate(enrollDate);
			}
			
			return member;
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
