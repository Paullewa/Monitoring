package com.rest.errorslog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;


@XmlRootElement(name="Errorslog")

public class Errorslog implements Serializable {
	

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
  @XmlElement
	public void setTime(Date time) {
		this.time = time;
	}

	public String getErrorDescription() {
		return ErrorDescription;
	}
 @XmlElement
	public void setErrorDescription(String errorDescription) {
		ErrorDescription = errorDescription;
	}

	public String getId() {
		return Id;
	}
@XmlElement
	public void setId(String id) {
		Id = id;
	}

	public int getErrorsNumber() {
		return ErrorsNumber;
	}
 @XmlElement
	public void setErrorsNumber(int errorsNumber) {
		ErrorsNumber = errorsNumber;
	}

public void setTime(java.sql.Date time2) {
	// TODO Auto-generated method stub
	
}


}



	
	 

