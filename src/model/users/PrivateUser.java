package model.users;

import java.util.ArrayList;

import model.Post;
import model.enums.PostType;

public class PrivateUser extends RegisteredUser{
	
	//Mainigie
	private ArrayList<Post> allPrivatePosts = new ArrayList<Post>();
	private ArrayList<Post> allPublicPosts = new ArrayList<Post>();
	private ArrayList<RegisteredUser> allMyFollowers = new ArrayList<RegisteredUser>();

	
	//Geteri
	public ArrayList<Post> getAllPrivatePosts() {
		return allPrivatePosts;
	}
	public ArrayList<Post> getAllPublicPosts() {
		return allPublicPosts;
	}
	public ArrayList<RegisteredUser> getAllMyFollowers() {
		return allMyFollowers;
	}
	
	//Seteri - netisk veidoti, jo nav iespeja saglabat ieprieks veidotus sarakstus saja objekta
	
	//Konstruktori
	public PrivateUser() {
		super();//izsauc Registered default konstruktors
	}
	
	public PrivateUser(String inputUserName, String inputPassword) {
		super(inputUserName, inputPassword);//izsauc Registered argumenta konstruktors
	}
	
	//toString funkcija
	public String toString() {//izsaucas Reguser toString funkcija
		String result = super.toString() + "Sludinajumi:\n -> " + allPrivatePosts + "\n ->" + allPublicPosts + ";\n Sekotaji -> " + allMyFollowers;
		return result;
	}
	
	//citas funkcijas
	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		// TODO Auto-generated method stub
		
	}


	
	

}
