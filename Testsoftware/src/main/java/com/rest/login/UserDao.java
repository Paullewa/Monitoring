package com.rest.login;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.connect.spi.Connection;




public class UserDao {
	
	List<User>Users = new ArrayList<>();
	

	public UserDao() {
		
		
		User User1 = new User();
		User1.setName("Paul");
		User1.setEmail("Paulle@gmqil.com");
		User1.setPassword("Hallo2");
		User1.setUser_id("001");
		
		User User2 = new User("Kiki","KIKi@ggmai","1234", " 002");
		
		Users.add(User1);
		Users.add(User2);
	}
	
	
	public List<User> getAllusers() {
			
		
		return Users;
		
	}
	
	// get one User
	public User getuser(String id) {
		
		for(User user1:Users) {
			
			if(user1.getEmail()== id) {
				
				return user1;
				
			}
			
		}
		return (User) Users;
		
	}
   
}

