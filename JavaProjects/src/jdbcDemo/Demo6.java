package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String dburl = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		String query = "INSERT INTO Movies VALUE(\"Finding Nemo\",\"Comedy-Drama\",\"Andrew Stanton\",2003;";
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
