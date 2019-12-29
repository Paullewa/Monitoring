package com.rest.rating;

import java.sql.Date;

public class Rating {
	
	// just add you rating hier
	public String Note;
	public Date Rating_date;

	public Rating() {
	    Rating_date = new Date(0);
		Note = null;
	}

	public Rating(String notee, Date Datee) {
		
		Note = notee;
		Rating_date = Datee; 
	}

	public String getNote(int ranging) {
		Note = "D";
		if(ranging == 5) {
			
			return Note;
		}
		
		switch (getNote(ranging).toUpperCase()) {
         case "C":
           ranging = 4;
           break;
         }
		switch (getNote(ranging).toUpperCase()) {
        case "B+":
          ranging  = 3;
            break;
		}
		switch (getNote(ranging).toUpperCase()) {
        case "B":
          ranging  = 2;
            break;
		}
		switch (getNote(ranging).toLowerCase()) {
        case "A":
          ranging  = 1;
            break;

		}
		return Note ;
	}
         		
	

	public void setNote(String note) {
		Note = note;
	}

	public Date getRating_date() {
		return Rating_date;
	}

	public void setRating_date(Date rating_date) {
		Rating_date = rating_date;
	}
	
	

}
