 package jdbc_123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DisplayProductData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Connection connection=null;
     try
     {
    	 Driver driver=new Driver();
    	 DriverManager.registerDriver(driver);
    	 String url ="jdbc:mysql://localhost:3306/jdbc830";
 		String user="root";
 		String pass="Ashish@8";
 		connection=DriverManager.getConnection(url,user,pass);
 		//step-3 create statement
		  Statement statement = connection.createStatement();
		 
		 //step-4 executeQuery 
		 String displayStudentQuery = "SELECT * FROM product";
		 ResultSet resultSet=statement.executeQuery(displayStudentQuery);
		 while(resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String color = resultSet.getString("color");
				double price = resultSet.getDouble("price");
				
				System.out.println("productId = "+id);
				System.out.println("productName = "+name);
				System.out.println("productColor = "+color);
				System.out.println("productPrice = "+price);
				System.out.println("========================================");
			}
     } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//step-5 close connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
