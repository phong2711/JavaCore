package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PracticePrepareStatement {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=true;trustServerCertificate=true;";
			String username = "sa";
			String password= "12345";
			connection = DriverManager.getConnection(url, username, password);
			
			String query2 = "select * from student where id = ? and firstname = ?";
			
			PreparedStatement pS = connection.prepareStatement(query2);
			pS.setInt(1, 3);
			pS.setString(2, "Minh");
			
			ResultSet rS = pS.executeQuery();
			
			List<Student> listStudents = new ArrayList<Student>();
			while(rS.next()) {
				Student student = new Student();
				student.setId(rS.getInt("id"));
				student.setFirstname(rS.getString("firstname"));
				student.setLastname(rS.getString("lastname"));
				student.setAge(rS.getInt("age"));
				listStudents.add(student);
			}
			
			for(Student student: listStudents) {
				System.out.println(student);
			}
			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
