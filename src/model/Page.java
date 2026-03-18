package model;

import java.util.ArrayList;

import model.users.PrivateUser;
import model.users.RegisteredUser;

public class Page extends PrivateUser{
	//Mainigie
	private String title;
	private String description;
	private ArrayList<RegisteredUser> allPageFollowers = new ArrayList<RegisteredUser>();
	private ArrayList<Post> allPostsInPage = new ArrayList<Post>();
		
	//Geteri
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public ArrayList<RegisteredUser> getAllPageFollowers() {
		return allPageFollowers;
	}
	public ArrayList<Post> getAllPostsInPage() {
		return allPostsInPage;
	}
	
	//Seteri
	public void setTitle(String inputTitle) {
		if(inputTitle !=null && !inputTitle.isEmpty() && inputTitle.matches("[A-Z]{1}[a-zA-Z0-9, .:]{3,50}") ) {
			title = inputTitle;
		}
		else {
			title = "Unknown";
		}
		
	}
	public void setDescription(String inputDescription) {
		if(inputDescription !=null && !inputDescription.isEmpty() && inputDescription.matches("[A-Z]{1}[a-zA-Z0-9, .:;]{2,150}") ) {
			description = inputDescription;
		}
		else {
			description = "Default description";
		}
	}
	
	//Konstruktori
	public Page() {
		setTitle("Default lapa");
		setDescription("Lapa par neko");
	}
	public Page(String inputTitle, String inputDescription) {
		setTitle(inputTitle);
		setDescription(inputDescription);	
	}
	
	//toString
	public String toString() {
		String result = title + " " + description + "; sludinajumi\n ->  " + allPostsInPage + "\n sekotaji -> " + allPageFollowers + "\n";
		return result;
	}	
	

}
