package com.rest.login;

public class User {
    private String User_id;
	private String Name;
	private String password;
	private String Email;
	
	public User() {
		User_id = "";
		Name = "";
		password = "";
		Email = "";
		
	}
	public User(String _User_id,String _name, String _password, String _email) {
		User_id = _User_id;
		Name = _name;
		password = _password;
		Email = _email;
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}
