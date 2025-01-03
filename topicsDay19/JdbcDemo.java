package chapter10;
import java.sql.*;

public class JdbcDemo {
	
	
	public static void main(String[] args) {
	
		String username ="root";
		String pwd ="root";
		String url ="jdbc:mysql://localhost:3307/testdb";

		try {
			//step 1
			System.out.println("Connecting..");
       Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2
			Connection con = DriverManager.getConnection(url,username,pwd);
		//step 3 checking connection
					
					System.out.println("Connected..");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
