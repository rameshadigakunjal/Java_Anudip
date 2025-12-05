package JDBCProject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		//JDBC URL, username, and password of mysql server
		String jdbcurl = "jdbc:mysql://localhost:3306/anpd3449";
		String username = "root";
		String password = "root";
		
		try {
			//Establish a connection
			Connection connect = DriverManager.getConnection(jdbcurl, username, password);
			
			System.out.println("Connection successful");
			
			connect.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}

