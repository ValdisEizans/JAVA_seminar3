package model;

import java.time.LocalDateTime;

public class Post {
	//Mainigie
	private String msg;
	private LocalDateTime dateTime = LocalDateTime.now();
	private int countOfLikes = 0; //TO DO parveidot uz sarakstu ar ereg lietotajiem, kas atzimejusi ka patik

	
	//Geteri
	public String getMsg() {
		return msg;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public int getCountOfLikes() {
		return countOfLikes;
	}
	
	//Seteri
	public void setMsg(String inputMsg) {
		if((inputMsg != null) && (!inputMsg.isEmpty()) && (inputMsg.length() < 1000)) {
			msg = inputMsg;
		}
		else {
			msg = "Unknown post";
		}
	}
	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}
	public void incrementCountOfLikes() {
		countOfLikes++;
	}
	
	//Konstruktori
	public Post() {
		setMsg("Default message");
		//ta ka datetime inicializets, nav jaizsauc konstruktora
		//ta ka countoflikes  mainigais inicializets, nav jaizsauc
	}
	
	public Post(String inputMsg) {
		setMsg(inputMsg);
	}	
	
	//ToString funkcija
	@Override
	public String toString() {
		String result = msg + "( " + dateTime + " )" + countOfLikes + " likes.";
		return result;
	}
}
