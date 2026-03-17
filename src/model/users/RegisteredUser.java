package model.users;

import java.security.MessageDigest;

public class RegisteredUser extends GuestUser{
	//Mainigie
	private String userName;
	private String title; //privatiem - vards un uzvards, bizensa - kompanijas nosaukums
	private String password;

	
	//Geteri
	public String getUserName() {
		return userName;
	}
	public String getTitle() {
		return title;
	}

	public String getPassword() {
		return password;
	}

	//Seteri
	public void setUserName(String inputUserName) {
		if(inputUserName != null && !inputUserName.isEmpty() && inputUserName.matches("[A-Za-z0-9]{4,20}")) {
			userName = inputUserName;
		}
		else {
			userName = "DefaultUser";
		}
	}
	
	public void setTitle(String title) {
		
	}	

	public void setPassword(String inputPassword) {
		try {
			MessageDigest  md = MessageDigest.getInstance("MD5");
			md.update(inputPassword.getBytes());
			password = md.digest().toString();
		}
		catch (Exception e){
			
		}

	}
	
	//Konstruktori
	
	//toString funkcija
	
	
	
	

}
