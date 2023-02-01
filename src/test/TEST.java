package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.kh.emp.model.vo.Employee;

public class TEST {

	private Connection conn;	
	private Statement stmt;		
	private ResultSet rs;		
	private PreparedStatement pstmt;

	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String user = "kh";
	private String pw = "kh1234";
		

	public List<Employee> selectAll(){
		List<Employee> empList = new ArrayList<>();
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pw);
					
			String sql = "SELECT EMP_ID, EMP_NAME, EMP_NO , EMAIL , PHONE, \r\n"
					+ "NVL(DEPT_TITLE, '부서없음') DEPT_TITLE,\r\n"
					+ "JOB_NAME, SALARY \r\n"
					+ "FROM EMPLOYEE\r\n"
					+ "LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)\r\n"
					+ "JOIN JOB USING (JOB_CODE)";
			
			
			pstmt = conn.prepareStatement(sql);
						
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empId = rs.getInt("EMP_ID");
				
				String empName = rs.getString("EMP_NAME");
				String empNo = rs.getString("EMP_NO");
				String email = rs.getString("EMAIL");
				String phone = rs.getString("PHONE");
				String deptTitle = rs.getString("DEPT_TITLE");
				String jobName = rs.getString("JOB_NAME");
				int salary = rs.getInt("SALARY");
				
				Employee emp = new Employee(empId, empName, empNo, email, phone, deptTitle, jobName, salary);
				
				empList.add(emp); // List 담기
			}
						
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return empList;
	}
	
	
}
