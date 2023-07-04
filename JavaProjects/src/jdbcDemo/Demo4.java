package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String dburl = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		String query = "Use action_movies;";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection (dburl, username, password);
			Statement stmt = con.createStatement();
			stmt.execute(query);

		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			con.close();
		}
		
	}

}
