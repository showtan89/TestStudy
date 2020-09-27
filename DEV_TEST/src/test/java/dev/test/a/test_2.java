package dev.test.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class test_2 {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:xe";
		String query ="insert into test_tabe (testcol1) " + 
				"values ('민석이')";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott","mybatis");
			pstmt = con.prepareStatement(query);
			
			int cnt = pstmt.executeUpdate();

			System.out.println(cnt);
		}catch(Exception e) {
		}
	}
}
