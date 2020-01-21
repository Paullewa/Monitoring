package com.rest.rating;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/rating")
public class Ratingservice {
	RatingDao dao = new RatingDao();
	

@GET
@Produces(MediaType.APPLICATION_JSON)
public String getrating()
{
	Gson gson = new Gson();
	return gson.toJson(dao.GetAll()) ;

}
@POST
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_JSON)
public Response Add_rating(String rated) {
	Gson gson = new Gson();
	Rating dat = gson.fromJson(rated, Rating.class);
	dat.setNote("A");
	dat.setRating_date(new Date());
	dao.GetAll();
	return Response.status(200).build();
	
}
}
