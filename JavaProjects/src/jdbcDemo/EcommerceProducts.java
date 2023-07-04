package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class EcommerceProducts {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String dbUrl="jdbc:mysql://localhost:3306/ecommerce";

		String username="root";

		String password="root";

		String query="select * from products;";

		Connection con=null;

		try {

		

		Class.forName("com.mysql.cj.jdbc.Driver");

		 con=DriverManager.getConnection(dbUrl,username,password);

		Statement stmt=con.createStatement();

		ResultSet rs=stmt.executeQuery(query);

		while(rs.next()) {

			System.out.print("Product_id :"+rs.getString("product_id") + "\t");

			System.out.print("Product_name:"+rs.getString("product_name") + "\t");

			System.out.println("Product_Price:"+rs.getString("product_price") +"\t");

			}
		}

		  catch(Exception e){

            System.out.println(e.getMessage());        	 

	}

		finally {

        con.close();

          }

	}

}

