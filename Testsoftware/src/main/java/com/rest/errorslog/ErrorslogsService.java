package com.rest.errorslog;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/Error")	
public class ErrorslogsService {
	
	ErrologDao dao = new ErrologDao();

	public ErrorslogsService() {
		System.out.println("Starting");
	}
	
@GET
@Consumes
 public String getErrolog() {
	 
	 Gson gson = new Gson();
	 
	 return gson.toJson(dao.getallError().toArray( new Errorslog[0]));
	
}

@Produces(MediaType.APPLICATION_JSON)
@Path("/id")
public String geterrortoJSON(@PathParam("id") String id)
{
 //   Errorslog Error = Errors.get(id);
	  Errorslog Error = dao.getErrorlog(id);
    	Gson gson = new Gson();
    	String result = gson.toJson(Error);
    			
	return result;
}
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_HTML)	
 public Response getresponse(String O_error)
 {
	
	Gson gson = new Gson();
	Errorslog response = gson.fromJson(O_error,Errorslog.class);
		response.setErrorDescription("Server Error");
	    response.setErrorsNumber(404);
	    response.setId(UUID.randomUUID().toString());
	    response.setTime(new java.util.Date());
	
	 dao.AddError(response) ;  
	 //Errors.put(response.getId(), response);
	 return Response.status(200).build(); 
 }

	/**
@PUT
@Consumes(MediaType.APPLICATION_JSON)
 public String AddError(@PathParam("id") String id) {
	ErrologDao Hero = new ErrologDao();
	Gson gson = new Gson();
	
	Hero.AddError(0, "Bug", 404, new Date(0));
	
	
	 
	return gson.toJson(Hero); **/
	
}

