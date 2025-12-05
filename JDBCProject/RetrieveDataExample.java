package JDBCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDataExample {

	public static void main(String[] args) {
		//JDBC URL, username, and password of mysql server
		String jdbcurl = "jdbc:mysql://localhost:3306/anpd3449";
		String username = "root";
		String password = "root";
		
		
		try(Connection connect = DriverManager.getConnection(jdbcurl, username, password);
			Statement s = connect.createStatement())
		{
		String selectData = "SELECT id, name FROM users";
		ResultSet resultSet = s.executeQuery(selectData);
				//Iterating over the resultset
				while(resultSet.next()) {
					String id = resultSet.getString("id");
					String name = resultSet.getString("name");
					System.out.println("ID : " + id + ", Name : " + name);
				}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
				

	}

}

