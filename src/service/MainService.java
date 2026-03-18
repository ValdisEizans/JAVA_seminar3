package service;

import java.util.ArrayList;

import model.Post;
import model.enums.PostType;
import model.users.GuestUser;
import model.users.PrivateUser;
import model.users.RegisteredUser;

public class MainService {
	//Saraksts visiem lietotajiem
	private static ArrayList<GuestUser> saraksts = new ArrayList<GuestUser>();

	public static void main(String[] args) {
		//Izveidot guest objektu un ielikt saraksta
		GuestUser guest1 = new GuestUser();
		saraksts.add(guest1);
		
		//Izveidot 2 private objektu un ielikt saraksta un izdrukat.
		PrivateUser priv1 = new PrivateUser();
		PrivateUser priv2 = new PrivateUser("Janis","J@nis1234");
		saraksts.add(priv1);
		saraksts.add(priv2);
		try {
			if(priv1.login("valdis", "V@ldis7865")) {
				//Izdrukat visus lietotajus.
				System.out.println(saraksts);
				
				//Katram private 2 postus un izdrukat
				priv1.createAndPublishPost("Sveiciens JAVA nodarbiba", PostType.publicType);
				priv1.createAndPublishPost("Man sodien dzimsanas diena!", PostType.privateType);
			}
			else {
				System.out.println("Nav pareizs lietotajvards vai parole!");
			}
		}
		catch (Exception e) {
			
		}
		System.out.println("-------------------------------------------------------");
		System.out.println(saraksts);

	}

	public static ArrayList<GuestUser> getSaraksts() {
		return saraksts;
	}
	
}
