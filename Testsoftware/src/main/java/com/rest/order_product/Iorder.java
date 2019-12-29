package com.rest.order_product;

 import java.sql.Date;;

public interface Iorder {
	
	 String id = null;
	 Date dateCreated = new Date(0);
	  String customer_Id = null;
	 
public String getId();		

	
public void setId(String id);		

public Date getDateCreated() ;
			

public void setDateCreated(Date dateCreated) ;
		

 public String getCustomer_Id();
		
		

 void setCustomer_Id(String customer_Id) ;	

}
