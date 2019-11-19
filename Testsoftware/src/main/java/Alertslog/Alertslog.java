package Alertslog;

public class Alertslog {

	public String User;
	private  String Password;
	private boolean UserIsvalid;
	
		
	public Alertslog() {
		
		User = "";
		Password = "";
		UserIsvalid = false;
	}


	public Alertslog(String newUser, String newPassw, boolean userValide) {
		
		User = newUser;
		Password = newPassw;
		UserIsvalid = userValide;
	}


	public String getUser() {
		return User;
	}


	public void setUser(String user) {
		User = user;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public boolean isUserIsvalid() {
		return UserIsvalid;
	}


	public void setUserIsvalid(boolean userIsvalid) {
		UserIsvalid = userIsvalid;
	}
	
	
	
	
	
	
}

