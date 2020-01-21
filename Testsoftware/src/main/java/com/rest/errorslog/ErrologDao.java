package com.rest.errorslog;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rest.basket.Orderbasket;


public class ErrologDao {
private	Connection con;

public ErrologDao() {
	
	
	
	
	
		
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection( "jdbc:h2:~/Documents/orders.db","sa","");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
public static void main( String[] args ) throws SQLException {

}    
	public Errorslog getErrorlog(String id) {
		Errorslog ret = new Errorslog();
		ret.setErrorDescription("Bug");
		ret.setErrorsNumber(404);
		ret.setId("012");
		// Hier von DB auffüllen
		// ret.setErrorDescription()
		return ret;
	}
	
	//public String AddError(int Id,String Errordescription, int Errornumber, Date time) {
	public String AddError(Errorslog log) {
		
				
		  
		  try {
			Statement	state = con.createStatement();		
			int Resultset = state.executeUpdate("insert into ERROR values( " + log.getId() +" , "+ log.getErrorDescription() + " ,"+ log.ErrorsNumber +", "+ log.getTime() +") ");
			
		if(Resultset==1) {
			return "Successful";
		}
		
		con.close();
		
		state.close();
		
		
	  } catch (Exception e) {
		
	}
		  return "Db error";
		
	}
	
	
	public List<Errorslog>getallError(){
	
		List<Errorslog> ErrorList  = new ArrayList<Errorslog>();		
		  
			  try {
					Class.forName("org.h2.Driver");
				Connection	con = DriverManager.getConnection( "jdbc:h2:~/Documents/orders.db","sa","");
				Statement	state = con.createStatement();		
				ResultSet rs = state.executeQuery("Select * from ERROR ");
				ErrorList = new ArrayList<Errorslog>();
				while(rs.next()) {
					String id = rs.getNString(1);
					String Errordescription = rs.getNString(2);
					int Errornumber = rs.getInt(3);
					Date time = rs.getDate(4);
		
				 ErrorList.add(new Errorslog(id,Errordescription,Errornumber,time));
		
	 
			  }
			con.close();
			rs.close();
			state.close();
			
			return ErrorList;
		  } catch (Exception e) {
			
		}
			  return ErrorList;
	}
}
    
	 
			  
			


		

