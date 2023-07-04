package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo7 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String dburl = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		String query = "UPDATE Movies SET genre = 'Comedy Drama' where title = 'Finding Nemo';";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection (dburl, username, password);
			Statement stmt = con.createStatement();
			stmt.execute(query);

		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			con.close();
		}
		
	}

}
