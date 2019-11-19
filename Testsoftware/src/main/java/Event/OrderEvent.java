package Event;



public  class OrderEvent {
	/** Id ist der kunde Id 
	 * Bestellung_start
	 * 
	 */
	
	private String Deliver;
	private int id;
	//private Date Bestellung_Start ;
	//private Date Bestellung_Ende ;	
	
	
	
	/**
	 *  Empty bean constructor.
	 * @param  
	 * @param bESTELLUNGS 
	 */
	
public OrderEvent() {
	    Deliver = null;
		id = -1;
		//Bestellung_Start = null;
		//Bestellung_Ende = null;
		
	}

    ///**Date bestellung_Start, Date bestellung_Ende

public OrderEvent( String Deliver,int id) {
	this.id = id;
	this.Deliver = Deliver;
	//this.Bestellung_Start= new Date();
	
	//this.Bestellung_Ende = new Date();
	
	}


	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getDeliver() {
		return Deliver;
	}



	public void setDeliver(String deliver) {
		Deliver = deliver;
	}


/**	public Date getBestellung_Start() {
		return Bestellung_Start;
	} **/



/**	public void setBestellung_Start(Date bestellung_Start) {
		Bestellung_Start = bestellung_Start; 
	
	}



	public Date getBestellung_Ende() {
		return Bestellung_Ende;
	}



	public void setBestellung_Ende(Date bestellung_Ende) {
		Bestellung_Ende = bestellung_Ende;
	}
       

	public static void main(String[] args) {
		Gson gson = new Gson();
		Format our Parameter date 
		
	SimpleDateFormat ft = 
			      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); 
		String json = gson.toJson(new Bestellung());
		System.out.println(json);
		System.out.println(gson.fromJson(json, Bestellung.class)); **/
	} 


