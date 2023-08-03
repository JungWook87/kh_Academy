package edu.kh.jdbc.run;

import java.sql.SQLException;

import edu.kh.jdbc.model.service.TestService;
import edu.kh.jdbc.model.vo.TestVO;

public class Run {

	public static void main(String[] args) {
		
		TestService service = new TestService();
		
		TestVO vo1 = new TestVO(1, "제목1", "내용1");
		
		try{
			int result = service.insert(vo1);
			
			if(result > 0) System.out.println("insert 성공");
			else System.out.println("insert 실패");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}

 /*
 1. CreateXMLFile
 2. dirver.xml
 3. LadiXMLFile
 4. JDBCTemplate
 5. Run / TestService / TestDAO / TestVO
*/