package jdbc_123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertValue {

	public static void main(String[] args) {
		try
		{
			// to load the driver
			// 1) way to load the driver
//			 Class.forName("com.mysql.cj.jdbc.Driver");
			//2) way
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		// create a connection
		String url="jdbc:mysql://localhost:3306/jdbc830";
		String user ="root";
		String pass="Ashish@8";
		Connection connection =DriverManager.getConnection(url, user, pass);
		
		// Create Statement
		Statement statement =connection.createStatement();
		
		// execute query
		String insertQuery="insert into product values (105,'Marker','yellow',70)";
		statement.execute(insertQuery);
		System.out.println("Data===================inserted=================");
		connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
