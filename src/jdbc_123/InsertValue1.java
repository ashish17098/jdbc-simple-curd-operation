package jdbc_123;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
 
public class InsertValue1 {

	public static void main(String[] args) {
		Connection connection =null;
		try
		{
			// Register the driver
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			// Create connection
			String url="jdbc:mysql://localhost:3306/jdbc830";
			String user="root";
			String pass ="Ashish@8";
			connection=DriverManager.getConnection(url, user, pass);
			// create statement
			
			Statement  statement=connection.createStatement();
			
			// execute Query 
			// String insertQuery="insert into product (id,name , color ,price) values (107,'Marker','Black',1200)";
		//	statement.execute(insertQuery);
//			String updateQuery ="update product set price=200 where id=107 ";
//			statement.executeUpdate(updateQuery);
			String displayQuery = "select * from product";
			ResultSet resultSet=statement.executeQuery(displayQuery); 
			System.out.println("Product Details...............");
			System.out.println("  Id    "+ "  Name     "+"    Color   " +"   Price");
			System.out.println();
			while(resultSet.next())
			{ 
			
				int id=resultSet.getInt("id");
				String name1 = resultSet.getString("name"); 
				String color1=resultSet.getString("color");
				Double  price1=resultSet.getDouble("price");
				
				
				System.out.println("  "+id +  "      "+name1+"         "+ color1+"        "+price1);
				
			}
			
			
			
		
//			System.out.println("=================Data Inserted====================");
//			System.out.println("===========Data Updated=================");
			
			System.out.println("=================================");
			connection.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		;
		

	}

}
