package Datenbank;
import java.sql.*;

public class DBconnect 
 
{
	public String DBconnect() throws SQLException {
		Connection con = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection( "jdbc:h2:tcp:http://localhost:8080/Testsoftware/Orders","", " ");
		Statement state = con.createStatement();
		ResultSet rs = state.executeQuery("select * from ");
				
	}catch(Exception e){ System.out.println(e);

                        }
	return null ;
         }
}
	
