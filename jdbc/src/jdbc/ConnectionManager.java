package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public  Connection main1(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");  
		
		if (con != null)
		{
			System.out.println("Connected");
			return con;
		}
		else
		{
			System.out.println("not Connected");
		}
		return con;
	}

}
