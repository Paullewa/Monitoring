package com.rest.payement;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.inject.Singleton;
import javax.validation.constraints.Past;
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


@Singleton
@Path("/Payment")
public class PaymentsService {
Map<String,Payments>paypal;

public PaymentsService() {
	
	String testuuid = UUID.randomUUID().toString();
	paypal = new HashMap<String, Payments>();
	Payments Ipay = new Payments();
	 Ipay.setBillingAdress_id("122");
	 Ipay.setCardHolder("Paul");
	 Ipay.setCurrency('$');
	 new Date();
	//Ipay.setPaymentDay( (java.sql.Date) Date.from(null));
	
	paypal.put(Ipay.getBillingAdress_id(), Ipay);
}
@GET
@Consumes
public String GetPayement() {
Gson gson = new Gson();
	
return gson.toJson(paypal.values().toArray(new Payments[paypal.size()]));
	
}

@Produces(MediaType.APPLICATION_JSON)
@Path("/id")
public String  Getpayementojson(@PathParam("id") String id) {
	
	Payments Gpay = paypal.get(id);
	Gson  gson = new Gson();
	String result = gson.toJson(Gpay);
	
	return result;	
}
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_HTML)	
public Response getresponse(String n_payment) {
	Gson gson = new Gson();
	Payments response = gson.fromJson(n_payment, Payments.class);
		response.setBillingAdress_id("Be10365_16A");
		response.setCardHolder("Visa");
		response.setCurrency('€');
		//response.setPaymentDay(_paymentDay);
		new Date();
		
			
	 paypal.put(response.getBillingAdress_id(), response);
	 return Response.status(200).build();
 }
	
}


