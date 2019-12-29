package com.rest.errorslog;
import java.sql.*;

public class ErrologDao {
	
		private ErrorslogsService errologservice = new ErrorslogsService();
	
		/**
		public int getError(Errorslog newError) {
		Connection con = errologservice.
			Statement state = null;
			
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection( "jdbc:h2:~/Documents/orders.db","sa","");
			state = con.createStatement();
			
			//1- Create a Table
			String sql ="CREATE TABLE Error" + 
		            "(id INT NOT NULL," + 
		            " ErrorDescription VARCHAR(255)," +  
		            " ErrorsNumber INT," +
		            " time Date," +
		            " PRIMARY KEY ( id ));"; 
			
			//2- Add Element		
			String sql =  "INSERT INTO Error " + "VALUES (6,'Serverbug',040,'1998-04-16')"; 
			//3-executed the Sql_statement
			state.execute(sql);	
					          
		   }catch(Exception e){ System.out.println(e);
		   
						      }
		return 0;	
		}
	    **/
/**		
	 public void closeConnection() throws SQLException {
		 	 		
	    	if (Isconnect()) {
	    	con.close();
	    	con = null;
	    	
	    	}
	 }
	    	
	 public boolean Isconnect()
	 {
		 return (con!= null);
	 };
**/
	}

	 
			  
			


		

