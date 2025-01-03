package chapter10;
import java.sql.*;
class Student{
	//api for connect db
	Connection ConnectDB(){

		String username ="root";
		String pwd ="root";
		String url ="jdbc:mysql://localhost:3307/testdb";
		Connection con = null;
		try {
			//step 1
			System.out.println("Connecting..");
       Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2
			 con = DriverManager.getConnection(url,username,pwd);
		//step 3 checking connection
					
					System.out.println("Connected..");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
		
		
	}
	//create table for first time
	void createStudentTable() {
		
		// establish connection here
		Connection con =  ConnectDB();
		String dropTableSQL = "DROP TABLE IF EXISTS student";	
	    String createtable = "CREATE TABLE Persons (\r\n"
	    		+ "    id int,\r\n"
	    		+ "    LastName varchar(255),\r\n"
	    		+ "    FirstName varchar(255),\r\n"
	    		+ "    Address varchar(255),\r\n"
	    		+ "    City varchar(255)\r\n"
	    		+ ");";
	    
	    try {
			Statement st = con.createStatement();
	        st.execute(dropTableSQL) ; 
	        st.execute(createtable) ; 
	        System.out.println("Table created successfully, ");    
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		
		
		
	}
	
	
	void addStudentRecord() {
			
	}
	
	void getStudentRecored() {
		
	}
	
	
void updateStudentRecord() {
		
	}


void deleteStudentRecord() {
	
}
}



public class JdbcDemo {
	  public static void main(String[] args) {
	
		Student t = new Student();
		t.createStudentTable();
		
	}

}
