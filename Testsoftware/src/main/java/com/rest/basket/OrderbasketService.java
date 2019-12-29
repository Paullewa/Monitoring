package com.rest.basket;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.rest.order_product.Order;


@Path("/basket")
public class OrderbasketService {
	
private Map<String,Orderbasket>Bask ;

public OrderbasketService(){	
   String testkey = UUID.randomUUID().toString();
   Bask =  new HashMap<String, Orderbasket>();

   
   Orderbasket desor = new Orderbasket();
  //Orderbasket.getId acced the Order_id our class order_product
   desor.setOrderbasket(new Order());
   desor.setStatus("new Items Added");
   desor.setItem_id(0);
   //desor.Orderbasket.setDateCreated((java.sql.Date) new Date());
   
    Bask.put(testkey, desor);

}

@GET
@Consumes
 public String getbasket() {	 
	 Gson gson = new Gson();
	 return gson.toJson( Bask.values().toArray(new Orderbasket[Bask.size()]));
	
}

@Produces(MediaType.APPLICATION_JSON)
@Path("/id")
public String getOdreBaskettoJSON(@PathParam("id") String id)
{
    Gson gson = new Gson();
    	String result = gson.toJson(Bask);
    			
	return result;
}
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_HTML)	
 public Response getrOrderB(String O_OrderBask)
 {
	Gson gson = new Gson();
	Orderbasket response = gson.fromJson(O_OrderBask,Orderbasket.class);
		response.setItem_id(0);
	    response.setStatus("new item  was added");
	    response.setOrderbasket(new Order()); 
	    String testkey = UUID.randomUUID().toString();
	    
	 Bask.put(testkey, response);
	 return Response.status(200).build();
	 
 }
}
	
