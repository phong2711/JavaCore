package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnect {
	public static void main(String[] args) throws ClassNotFoundException {
		// 1. connect
		// 1.1. Register the driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// 1.2. Create a connection to the database
		String url = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=true;trustServerCertificate=true;";
		String username = "sa";
		String password= "12345";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			
			// 2. Query
			// 2.1. Create a query
			// 2.2. Query the database
			String query1 = "select * from  student";
			
			// 3. Process result
			Statement statement = connection.createStatement();
			// 2.2-3.1. Get result set
			ResultSet resultSet = statement.executeQuery(query1);
			// 3.2. Assign results to Java variables
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("firstname");
				String lastName = resultSet.getString("lastname");
				int age = resultSet.getInt("age");
				System.out.println(id + " - " + lastName + " " + firstName + " - " + age);
			}
			
			
			// Demo executeUpdate
			String query2 = "update student set age = 30 where id = 1";
			int rowUpdated = statement.executeUpdate(query2);
			System.out.println("Update successful " + rowUpdated);
			
			// Demo execute
//			String query3 = "insert into student values (4, 'phong4', 'phung', 21)";
//			boolean check = statement.execute(query3);
//			if(check) {
//				System.out.println("Return a ResultSet - Select");
//			} else {
//				System.out.println("Update - Insert - Delete");
//				int rowInserted = statement.getUpdateCount();
//				System.out.println("Insert successful " + rowInserted);
//			}
			
			boolean check = statement.execute(query1);
			if(check) {
				System.out.println("Return a ResultSet - Select");
				ResultSet rs = statement.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt("id") + " - " + rs.getString("firstname"));
				}
			} else {
				System.out.println("Update - Insert - Delete");
			}
			
//			System.out.println("Connect okok");
		} catch (SQLException e) {
			System.out.println("SQL exeption");
			e.printStackTrace();
		} finally {
			// 4. Close connection
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
