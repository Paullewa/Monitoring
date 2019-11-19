package Event;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;


@Path("/Bestellungs")
public class OrderEventservice {
	

	protected static final String[] BESTELLUNGS = {"Alter_kunden", "Neuen_Kunde"};


 	@GET
 	@Produces(MediaType.APPLICATION_JSON)
 	public String getBestellungs()
     {
	  List<OrderEvent>Bestellunglist = new ArrayList<>();
	
	 for(int i = 0; i < BESTELLUNGS.length; ++i ) 
		Bestellunglist.add(new OrderEvent(BESTELLUNGS[i],i));
	 
			Gson gson = new Gson();
	   return gson.toJson(Bestellunglist.toArray(new OrderEvent[Bestellunglist.size()]));

	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/id")
	 public String getJsonBestellung(@PathParam("id")int id)
  {
	  String bestellungstext = BESTELLUNGS[id];
	  OrderEvent bestellt = new OrderEvent(bestellungstext,id);
	  Gson gson = new Gson();
		return gson.toJson(bestellt);
			  
  }
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{id}")
	public String getPlainTextGreeting(@PathParam("id") int id)
	{
		String greeting = BESTELLUNGS[id];
		return greeting;
	}
	
	@POST
	// @Path("/best")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(String gestellung) {
		Gson gson = new Gson();
		OrderEvent best = gson.fromJson(gestellung, OrderEvent.class);

		String result = "Die Ware : " + best;
		return Response.status(201).entity(result).build();
} 
}
