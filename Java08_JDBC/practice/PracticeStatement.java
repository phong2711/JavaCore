package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticeStatement {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String url = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=true;trustServerCertificate=true;";
		String username = "sa";
		String password = "12345";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			String query2 = "Select * from student";
			Statement statement = connection.createStatement();
			
			// statement.executeQuery()
			ResultSet resultSet = statement.executeQuery(query2);

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("firstname");
				String lastName = resultSet.getString("lastname");
				int age = resultSet.getInt("age");
				System.out.println(id + " - " + lastName + " " + firstName + " - " + age);
			}

			// statement.executeUpdate()
			String query = "update student set age = 28 where id = 1";
			int rowUpdated = statement.executeUpdate(query);
			System.out.println("Update successful " + rowUpdated);

			String query3 = "update student set lastname = 'Nguyen', firstname = 'Minh' where id = 3";
			int rowUpdated2 = statement.executeUpdate(query3);
			System.out.println("Update successful " + rowUpdated2);
			
			// statement.execute()
			boolean check = statement.execute(query2);
			if(check) {
				System.out.println("Return a ResultSet - Select");
				ResultSet rS = statement.getResultSet();
				while(rS.next()) {
					System.out.println(rS.getInt("id") + " - " + rS.getString("firstname"));
				}
			} else {
				System.out.println("Update - Insert - Delete");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
