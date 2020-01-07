package com.rest.basket;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.rest.order_product.Order;

public class OrderbasketDao {}
/**	
List<Orderbasket> OrdebasketList  = new ArrayList<Orderbasket>();;
  public List<Orderbasket>getallorderbasket(){
	  
	  
	  try {
			Class.forName("org.h2.Driver");
		Connection	con = DriverManager.getConnection( "jdbc:h2:~/Documents/orders.db","sa","");
		Statement	state = con.createStatement();		
		ResultSet rs = state.executeQuery("Select * from Orderbasket ");

		//with getObject we cann  read every type of daten 
/**		
		Class<?>  = rs.getObject("Orderbasket").getClass();
		while(rs.next()) {
			
			Date dateCreated = rs.getDate("DATE_CREATION");
			String customer_Id = rs.getString("CUSTOMER_ID");
			String Id = rs.getString("ID");
			String order_name = rs.getString("ORDER_NAME");
			new Order(order_name,Id,dateCreated,customer_Id);

			/**		Object dateCreated = rs.getObject("DATE_CREATION");
			Object customer_Id = rs.getObject("CUSTOMER_ID");
			Object Id = rs.getObject("ID");
			Object order_name = rs.getObject("ORDER_NAME");
			Order order = new Order(order_name,); **/
			
			/**
			int Item_Id =  rs.getInt("ITEM_ID");
			String Status = rs.getNString("STATUS");	
			Orderbasket bas = new Orderbasket(Order,Item_Id,Status);  
			**/
		/**	
			for (int i =0;i< 4 ; i++) {
				OrdebasketList.
			}
			
			
		}
		
		
	
		 return OrdebasketList;
	  }
	  
	  catch (Exception e) {
		// TODO: handle exception
		 
	}
	return OrdebasketList; 
  
	
  }
} **/
