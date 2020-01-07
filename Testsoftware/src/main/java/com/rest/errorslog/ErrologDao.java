package com.rest.errorslog;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rest.basket.Orderbasket;

@XmlType
@XmlRootElement
public class ErrologDao {
	
	public String AddError(int Id,String Errordescription, int Errornumber, Date time) {
		
				
		  
		  try {
				Class.forName("org.h2.Driver");
			Connection	con = DriverManager.getConnection( "jdbc:h2:~/Documents/orders.db","sa","");
			Statement	state = con.createStatement();		
			int Resultset = state.executeUpdate("insert into ERROR values(" + Id +", ' "+ Errordescription + " ',"+ Errornumber +", "+ time +") ");
			
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
	
		List<Errorslog> ErrorList  = null;		
		  
			  try {
					Class.forName("org.h2.Driver");
				Connection	con = DriverManager.getConnection( "jdbc:h2:~/Documents/orders.db","sa","");
				Statement	state = con.createStatement();		
				ResultSet rs = state.executeQuery("Select * from ERROR ");
				ErrorList = new ArrayList<Errorslog>();
				while(rs.next()) {
					String id = rs.getNString(0);
					String Errordescription = rs.getNString(1);
					int Errornumber = rs.getInt(2);
					Date time = rs.getDate(3);
		
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

	 
			  
			


		

