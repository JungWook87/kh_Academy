package edu.kh.jdbc.member.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import static edu.kh.jdbc.common.JDBCTemplate.*;
import edu.kh.jdbc.member.vo.Member;

public class MemberDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	public MemberDAO() {
		try {
			prop = new Properties();
			prop.loadFromXML(new FileInputStream("member-query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/** 내 정보 조회 서비스 DAO
	 * @param loginMember
	 * @return mem
	 */
	public Member selectMyInfo(Connection conn, Member loginMember) {
		Member mem = null;
		
		try {
			String sql = prop.getProperty("select");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginMember.getMemberId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem = new Member(rs.getInt("MEMBER_NO"), rs.getString("MEMBER_ID"), rs.getString("MEMBER_NM"), 
						rs.getString("MEMBER_GENDER"), rs.getString("ENROLL_DATE"));
				mem.setMemberPw(rs.getString("MEMBER_PW"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return mem;
	}

	/** 회원 목록 조회 DAO
	 * @param conn
	 * @param loginMember
	 * @return memList
	 */
	public List<Member> selectAll(Connection conn, Member loginMember) {
		List<Member> memList = new ArrayList<>();
		
		try {
			String sql = prop.getProperty("selectAll");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginMember.getMemberId());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member mem = new Member(rs.getInt("MEMBER_NO"), rs.getString("MEMBER_ID"), rs.getString("MEMBER_NM"),
						rs.getString("MEMBER_GENDER"), rs.getString("ENROLL_DATE"));
				
				memList.add(mem);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return memList;
	}

	
	/** 내 정보 수정(이름, 성별) DAO
	 * @param conn
	 * @param loginMember
	 * @param inputName
	 * @param inputGender
	 * @return result
	 */
	public int updateMember(Connection conn, Member loginMember, String inputName, String inputGender) {
		int result = 0;
		try {

			String sql = prop.getProperty("update");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputName);
			pstmt.setString(2, inputGender);
			pstmt.setString(3, loginMember.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}


	/** 비밀번호 변경 DAO
	 * @param conn
	 * @param loginMember
	 * @param pw1
	 * @return result
	 */
	public int updatePw(Connection conn, Member loginMember, String pw1) {
		int result = 0;
		
		try {
			String sql = prop.getProperty("updatePw");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pw1);
			pstmt.setString(2, loginMember.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}


	/** 회원탈퇴 DAO
	 * @param conn
	 * @param loginMember
	 * @return result
	 */
	public int secession(Connection conn, Member loginMember) {
		int result = 0;
		
		try {
			
			String sql = prop.getProperty("secession");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginMember.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	

}
