package com.rest.order_product;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.h2.expression.function.ToDateParser;

import com.google.gson.Gson;
import com.rest.errorslog.Errorslog;
import com.rest.event.OrderEvent;

@Singleton
@Path("TOrders")
public class OrderService {
	// Making a map to store our information
	
   private Map<String,Order>TakeOrder;
     
	
public OrderService() {
	
		// Generate a key 	
		String testuuid = UUID.randomUUID().toString();
		TakeOrder = new HashMap<String, Order>();
		new Date();
		Order Tod = new Order();
		Tod.setCustomer_Id("BA");
		Tod.setId(testuuid.toUpperCase());
		Tod.setOrder_name("Buy".toLowerCase());
		//Tod.setDateCreated(new Date());
		Order Tod1 = new Order();
		Tod1.setCustomer_Id("BA01");
		Tod1.setId(testuuid.toUpperCase());
		Tod.setOrder_name("Sell".toLowerCase());
		TakeOrder.put(Tod.getId(), Tod);
		TakeOrder.put(Tod1.getId(), Tod1);
}

@GET
@Consumes
public String getOrder() {
 
 Gson gson = new Gson();
 return gson.toJson(TakeOrder.values().toArray( new Order[TakeOrder.size()]));

}

@Produces(MediaType.APPLICATION_JSON)
@Path("/id")
public String getOrdertoJSON(@PathParam("id") String id)
{
   Order GET = TakeOrder.get(id);
	Gson gson = new Gson();
	String result = gson.toJson(GET);
			
return result;
    }

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_HTML)	
 public Response getresponse(String N_Order)
 {
	Gson gson = new Gson();
	Order response = gson.fromJson(N_Order,Order.class);
		response.setOrder_name("Buy");
	    response.setId(UUID.randomUUID().toString());
	    response.setCustomer_Id("Jean12/5/2019");
	    
			
	 TakeOrder.put(response.getId(), response);
	 return Response.status(200).build();
 }


}

	


  
