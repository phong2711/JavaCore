package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DemoSelect {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// Register driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			// Create connect
			String url = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=true;trustServerCertificate=true;";
			String username = "sa";
			String password= "12345";
			connection = DriverManager.getConnection(url, username, password);
			
			// Create query
			String query1 = "select * from  student";
			
			// Create statement
			Statement statement = connection.createStatement();
			// Get ResultSet
			ResultSet resultSet = statement.executeQuery(query1);
			
			// Assign results to Java variables
			List<Student> listStudents = new ArrayList<Student>();
			while(resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getInt("id"));
				student.setFirstname(resultSet.getString("firstname"));
				student.setLastname(resultSet.getString("lastname"));
				student.setAge(resultSet.getInt("age"));
				listStudents.add(student);
			}
			
			
			// Process result ...
			for(Student student: listStudents) {
				System.out.println(student);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
