package model.users;

import java.util.ArrayList;
import java.util.Random;

import model.Page;
import model.Post;
import model.enums.PostType;

public class BusinessUser extends RegisteredUser{
	//Mainigie
	private ArrayList<Page> allPages = new ArrayList<Page>();
	
	//Geteri
	public ArrayList<Page> getAllPages() {
		return allPages;
	}

	//Konstruktori
	public BusinessUser() {
		setId();
		setUserName("Lietotajs");
		setPassword("L13totajs345");
	}
	public BusinessUser(String inputUsername, String inputPassword) {
		super(inputUsername, inputPassword);
	}
	
	//toString funkcija
	public String toString() {
		String result = super.toString() + " -> " + allPages;
		return result;
	}

	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		Random rand = new Random();
		allPages.get(rand.nextInt(0,allPages.size())).getAllPostsInPage().add(new Post(inputMsg));
		
	}

}
