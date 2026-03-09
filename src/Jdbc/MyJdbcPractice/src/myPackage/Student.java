package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {
	
	public void createDatabase() {
	try {
		
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String password = "A@b12345";
		
		Connection conn = DriverManager.getConnection(url, userName, password);
		Statement st = conn.createStatement();
		
		
		String query = "create database UEM";
		st.execute(query);
		System.out.println("database created successfully");
		conn.close();
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

}

	public void createTable() {
		try {
			
			String url = "jdbc:mysql://localhost:3306/UEM";
			String userName = "root";
			String password = "A@b12345";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			Statement st = conn.createStatement();
			
			
			String query = "CREATE TABLE Students (StudentID INT PRIMARY KEY, FirstName VARCHAR(50), LastName VARCHAR(50), Age INT)";
			st.execute(query);
			System.out.println("Table created successfully");
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void createData() {
		try {
			
			String url = "jdbc:mysql://localhost:3306/UEM";
			String userName = "root";
			String password = "A@b12345";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			String query = "INSERT INTO Students (StudentID, FirstName, LastName, Age) VALUES (?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 2);
			pstm.setString(2, "rahul");
			pstm.setString(3, "saha");
			pstm.setInt(4, 23);
			
			
			pstm.execute();
			
			System.out.println("data inserted created successfully");
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void readData() {
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/UEM";
			String userName = "root";
			String password = "A@b12345";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			String query = "select * from students";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(query);
		    while(rs.next()) {
		    	System.out.println("id: "+rs.getInt(1));
		    	System.out.println("f_name: "+rs.getString(2));
		    	System.out.println("l_name: "+rs.getString(3));
		    	System.out.println("age: "+rs.getInt(4));
		    	
		    }
		    stm.execute(query);
			
			System.out.println("read data successfully");
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void updateData() {
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/UEM";
			String userName = "root";
			String password = "A@b12345";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			String query = "update students set  studentId = ? where FirstName=?";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 10);
			pstm.setString(2, "rahul");
			
			
			pstm.execute();
			
			System.out.println("data updated successfully");
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	public void deleteData() {

	    try {

	        String url = "jdbc:mysql://localhost:3306/UEM";
	        String userName = "root";
	        String password = "A@b12345";

	        Connection conn = DriverManager.getConnection(url, userName, password);

	        String query = "DELETE FROM students WHERE FirstName = ?";

	        PreparedStatement pstm = conn.prepareStatement(query);

	        pstm.setString(1, "rahul");

	        int rows = pstm.executeUpdate();

	        if(rows > 0) {
	            System.out.println("Data deleted successfully");
	        } else {
	            System.out.println("No record found");
	        }

	        conn.close();

	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}
