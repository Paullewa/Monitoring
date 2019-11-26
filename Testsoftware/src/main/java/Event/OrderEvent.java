package Event;

import java.util.Date;


public  class OrderEvent {
	
	
	private String Eventstypes;
	private String Event_id;
	private Date Time_event;
	
	public OrderEvent() {
		
		Eventstypes = " ";
		Event_id = " ";
		Time_event = null;
		
	}

	public OrderEvent(String Eventname, String even_id, Date tim_event) {
		
		Eventstypes = Eventname;
		Event_id = even_id;
		Time_event = tim_event;
	}


		

	public String getEventstypes() {
		return Eventstypes;
	}

	public void setEventstypes(String eventstypes) {
		Eventstypes = eventstypes;
	}

	public String getEvent_id() {
		return Event_id;
	}

	public void setEvent_id(String event_id) {
		Event_id = event_id;
	}

	public Date getTime_event() {
		return Time_event;
	}

	public void setTime_event(Date time_event) {
		Time_event = time_event;
	}

}

