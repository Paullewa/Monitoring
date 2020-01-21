package com.rest.rating;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rest.login.User;

public class RatingDao {
	
	
private	List<Rating>Get_rating = new ArrayList<Rating>();
	
	public  RatingDao() {
		
		Rating rate1 = new Rating("A", new Date());
		Rating rate2 = new Rating("B", new Date());
		
		Get_rating.add(rate1);
		Get_rating.add(rate2);
	} 
	 // Get all Rating
	public List<Rating> GetAll()
	{
		
		return Get_rating;
		
		
	}

	
// Get one Rating	
public Rating get1Rate(Date day) {
		 
		for(Rating rate1:Get_rating) {
			// if the day we put is the same als the date of the rating
			
			if(rate1.getRating_date()== day)
			{
				
				return rate1;				
				
        	}
			
			return rate1;
		}
		return (Rating) Get_rating;
		
	
		}
}






