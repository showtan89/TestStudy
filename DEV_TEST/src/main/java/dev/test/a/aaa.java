package dev.test.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class aaa {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String query ="insert into test_tabe (testcol1) " + 
				"values (?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		System.out.println(3333);
		try {
			Class.forName(driver);
			System.out.println(666);
			con = DriverManager.getConnection(url, "scott","tiger");
			System.out.println(777);
			pstmt = con.prepareStatement(query);
			System.out.println(888);
			pstmt.setString(1,"민석이");
			System.out.println(9999);
			int cnt = pstmt.executeUpdate();
			System.out.println(4444);
			System.out.println(cnt);
		}catch(Exception e) {
			System.out.println(22222);
		}
		System.out.println(1111);
	}
		
		
	
}
