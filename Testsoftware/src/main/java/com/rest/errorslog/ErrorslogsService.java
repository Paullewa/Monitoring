package com.rest.errorslog;

import java.sql.Date;
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

@Path("/Error")	
public class ErrorslogsService {

	private Map<String,Errorslog> Errors;

	public ErrorslogsService() {
		 String cle = UUID.randomUUID().toString();
		Errors = new HashMap<String, Errorslog>();
		Errorslog erreur = new Errorslog("ServerError",cle,404,new Date(0, 0, 0));
	  Errors.put(erreur.getId(), erreur);
		
	}
	
@GET
@Consumes
 public String getErrolog() {
	 
	 Gson gson = new Gson();
	 return gson.toJson(Errors.values().toArray( new Errorslog[Errors.size()]));
	
}

@Produces(MediaType.APPLICATION_JSON)
@Path("/id")
public String geterrortoJSON(@PathParam("id") String id)
{
    Errorslog Error = Errors.get(id);
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
	    response.setTime(new Date(0));
			
	 Errors.put(response.getId(), response);
	 return Response.status(200).build();
 }
	
}