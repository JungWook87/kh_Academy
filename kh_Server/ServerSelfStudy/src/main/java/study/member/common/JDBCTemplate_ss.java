package study.member.common;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCTemplate_ss {
	
	public static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			Context initContext = new InitialContext();
			
			Context envContext = (Context)initContext.lookup("java:comp/env");
			
			DataSource ds = (DataSource)envContext.lookup("jdbc/oracle");
			
			conn = getConnection();
			
			conn.setAutoCommit(false);
			
		} catch(Exception e) {
			System.out.println("[Connection생성 중 예외 발생]");
			e.printStackTrace();
		}
		
		
		return conn;
	}
}
