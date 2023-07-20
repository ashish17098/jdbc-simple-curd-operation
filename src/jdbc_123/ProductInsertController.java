package jdbc_123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsertController {

	public static void main(String[] args) {
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/jdbc830";
			String user="root";
			String pass="Ashish@8";
					connection =DriverManager.getConnection(url,user,pass);
					Statement statement =connection.createStatement();
					String insertQuery="insert into product(id,name,color,price) values (106, 'pen','red',35)";
					statement.execute(insertQuery);
					System.out.println("Data===================inserted=================");
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null)
				{
					connection.close();	
				}
				else
				{
					System.out.println("pls first establish connection");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
