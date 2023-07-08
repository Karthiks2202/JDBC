package JDBC;
import java.sql.*;
public class ConnectionClass {

	public static void main(String[] args) throws SQLException
	{
	Connection connection=null;
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=(Connection)DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/testing",
				"root","22mc023");
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	if(connection!=null)
	{
		System.out.println("connection Established");
	}
	else
	{
		System.out.println("Connection Not Established");
	}

	}

}
