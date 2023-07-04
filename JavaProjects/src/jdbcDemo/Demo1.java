package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String dburl = "jdbc:mysql://localhost:3306/Animated_Movies";//Connection String
		String username = "root";
		String password = "root";
		String query = "select * from Movies;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection (dburl, username, password); //Connecting to DB
		Statement stmt = con.createStatement();//Execute the query
		ResultSet rs = stmt.executeQuery(query);//Save the result after executing the query
		
		while(rs.next()) {
			System.out.print("Title: " + rs.getString("title") + "\t");
		    System.out.print("Genre: " + rs.getString("genre") + "\t");
			System.out.print("Director: " + rs.getString("director") + "\t"); 
			System.out.println("Release Year: "+ rs.getString("relese_year"));
		}

	}

}
