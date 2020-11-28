package connect;
import java.sql.*;
public class Connect 
{
	public static final String url="jdbc:mysql://localhost:3306/covid";
	public static final String uid="root";
	public static final String pwd="root";

	public static Connection getConnection() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,uid,pwd);
		con.setAutoCommit(true);
		return con;
	}
}
