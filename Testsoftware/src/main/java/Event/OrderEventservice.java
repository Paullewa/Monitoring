package Event;

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
import com.google.gson.Gson;

@Singleton
@Path("/Orders")
public class OrderEventservice {
	
	// Making a map to store our information
	private Map<String, OrderEvent> orderevents;
	
	
	
	public OrderEventservice() {
		orderevents = new HashMap<String, OrderEvent>();
		// Generate a key 
		String testuuid = UUID.randomUUID().toString();
		OrderEvent testevent = new OrderEvent("Test", testuuid, new Date());
		// the key is corresponding to the Event_id our class
		orderevents.put(testevent.getEvent_id(), testevent);
	}

 	@GET
 	@Produces(MediaType.APPLICATION_JSON)
 	public String getOrdervents()
 	{
 		Gson gson = new Gson();
 		 	 				 	 	
 		 		
 		return gson.toJson(orderevents.values().toArray(new OrderEvent[orderevents.size()]));
 	}
 	
 	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/id")	
 	public String getJsonOrdervents(@PathParam("id")String id)
 	{
 		OrderEvent event = orderevents.get(id);
 		Gson gson = new Gson();
 		String ret = gson.toJson(event);
 		return ret;
 	}
 	
 	@POST
 	//@Path("/checked")
 	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
 	// Just to post the repose 
 	public Response postOrdervents(String O_event)
 	{
 		  Gson gson = new Gson();
 		
 		OrderEvent respos = gson.fromJson(O_event, OrderEvent.class);
 		respos.setEvent_id(UUID.randomUUID().toString());
 		respos.setTime_event(new Date());
 		orderevents.put(respos.getEvent_id(), respos); 		 	
 		 			
 		return Response.status(200).build();
 	}
 	
 	// Delete an existing event
 	 @Path("/{id}/delete")
 	public Response deleteEvent(@PathParam("id") String id) {
 		
 		OrderEvent event = orderevents.remove(id);
 		if (event != null) {
 			String result = " Even was successfull delete";
 			return  Response.status(201).encoding(result).build();
 		}
 		
 		return  Response.status(500).build();
 	}
}


    	
    	
  
