package Errorslog;

import java.util.Date;

public class Errorslog {
 
	 protected String ErrorDescription;
	 protected String Id;	
	 protected int ErrorsNumber;
	 protected Date time;
	 
	public Errorslog() {
		
		ErrorDescription = "";
		Id =  "";
		ErrorsNumber = -1;
		time = null;
	}

	public Errorslog(String error, String id_, int errorsNumber_, Date Error_times) {
		
		ErrorDescription = error;
		Id = id_;
		ErrorsNumber = errorsNumber_;
		time = Error_times;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getErrorDescription() {
		return ErrorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		ErrorDescription = errorDescription;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public int getErrorsNumber() {
		return ErrorsNumber;
	}

	public void setErrorsNumber(int errorsNumber) {
		ErrorsNumber = errorsNumber;
	}
	
	
	 
}
