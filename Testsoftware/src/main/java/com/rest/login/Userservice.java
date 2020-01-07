package com.rest.login;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;



@Path("User")
public class Userservice {
	
	
	
	UserDao Dao = new UserDao();
	
@GET
@Produces(MediaType.TEXT_HTML)
	public List <User>getuser(){
		Gson gson = new Gson();
		     
		return Dao.getAllusers() ;

}
}
