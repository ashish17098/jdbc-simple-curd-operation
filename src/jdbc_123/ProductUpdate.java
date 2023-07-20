package jdbc_123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ProductUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Connection connection=null;
     try {
     Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		String url ="jdbc:mysql://localhost:3306/jdbc830";
		String user="root";
		String pass="Ashish@8";
		connection=DriverManager.getConnection(url , user ,pass);
		Statement statement =connection.createStatement();
		String updateProductquery="update product set price=40 where id=102";
		int a=statement.executeUpdate(updateProductquery);
		System.out.println("a ="+a);
		if(a==1) {
			System.out.println("Data-----updated");
		}
		else
		{
			System.out.println("given id is not present");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		
		
	}

}
