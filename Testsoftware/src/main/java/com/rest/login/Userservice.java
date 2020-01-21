package com.rest.login;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.rest.rating.Rating;



@Path("/User")
public class Userservice {
	
	
	
	UserDao Dao = new UserDao();
	 
	
@GET
@Produces(MediaType.APPLICATION_JSON)
	public String getuser(){
		Gson gson = new Gson();
		     
		return gson.toJson(Dao.getAllusers()) ;

}
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_HTML)

public  Response AddUser(String news) {
	Gson gson = new Gson();
	User First = gson.fromJson(news, User.class);
/**	First.setName("Paul");
	First.setEmail("paullewa10@yahoo.fr");
	First.setPassword("");
	First.setUser_id("USER012"); **/
	
	return  Response.status(200).build() ;
	
}


}
