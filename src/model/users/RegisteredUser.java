package model.users;

import java.security.MessageDigest;

public class RegisteredUser extends GuestUser{
	//Mainigie
	private String userName;
	private String password;

	
	//Geteri
	public String getUserName() {
		return userName;
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

	public void setPassword(String inputPassword) {

		if(inputPassword != null && !inputPassword.isEmpty() && inputPassword.matches("/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/")) {
			
		}
		try {
			MessageDigest  md = MessageDigest.getInstance("MD5");
			md.update(inputPassword.getBytes());
			password = md.digest().toString();
		}
		catch (Exception e){
			password = "0000";
		}

	}
	
	//Konstruktori
	
	//toString funkcija
	
	
	
	

}
