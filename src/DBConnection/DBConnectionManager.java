package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionManager
{
	private String DBDRIVER	= "com.mysql.jdbc.Driver" ;
	private String DBURL = "jdbc:mysql://localhost:3306/notes?serverTimezone=UTC" ;
	private String DBUSER	= "root" ;
	private String DBPASSWORD = "zhuang626" ;
	private Connection conn	= null ;

	public DBConnectionManager()
	{
		try
		{
			
			Class.forName(DBDRIVER) ;
			this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;
		}
		catch (Exception e)
		{
		}
	}
	public Connection getConnection()
	{
		return this.conn ;
	}
	public void close()
	{
		try
		{
			this.conn.close() ;
		}
		catch (Exception e)
		{
		}
	}
};