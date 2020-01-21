package com.rest.order_product;


import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class Order implements Iorder {
	
private String Order_name;	
private String id;
private Date dateCreated;
private String customer_Id;


public Order() {
	Order_name = null;
	id = "";
	dateCreated = new Date();
	customer_Id = "";
	
}

public Order(String _order_name,String _id, Date _dateCreated, String _customer_Id) {
	this.Order_name = _order_name;
	this.id = _id;
	this.dateCreated = _dateCreated;
	this.customer_Id = _customer_Id;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public Date getDateCreated1() {
	return dateCreated;
}

public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
}

public String getCustomer_Id() {
	return customer_Id;
}

public void setCustomer_Id(String customer_Id) {
	this.customer_Id = customer_Id;
}

public String getOrder_name() {
	return Order_name;
}

public void setOrder_name(String order_name) {
	Order_name = order_name;
}

@Override
public java.sql.Date getDateCreated() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setDateCreated(java.sql.Date dateCreated) {
	// TODO Auto-generated method stub
	
}


	
}
	



	
	
    
    
    
    
	

	

  
