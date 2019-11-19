package Event;

import java.util.Date;


public  class OrderEvent {
	/** Id ist der kunde Id 
	 * Bestellung_start
	 * 
	 */
	
	private String ReceivedOrder;
	private int Event_id;
	private Date Time_event;
	
	public OrderEvent() {
		
		ReceivedOrder = " ";
		Event_id = -1;
		Time_event = null;
		
	}

	public OrderEvent(String receivedOrde, int even_id, Date tim_event) {
		
		ReceivedOrder = receivedOrde;
		Event_id = even_id;
		Time_event = tim_event;
	}

	//private Date Bestellung_Start ;
	//private Date Bestellung_Ende ;	
	
	
	
	public String getReceivedOrder() {
		return ReceivedOrder;
	}

	public void setReceivedOrder(String receivedOrder) {
		ReceivedOrder = receivedOrder;
	}

	public int getEvent_id() {
		return Event_id;
	}

	public void setEvent_id(int event_id) {
		Event_id = event_id;
	}

	public Date getTime_event() {
		return Time_event;
	}

	public void setTime_event(Date time_event) {
		Time_event = time_event;
	}

}

