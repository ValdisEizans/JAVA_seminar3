package model.users;

public class GuestUser {
	//Mainigie
	protected long id;
	private static long counter = 1;
	
	//Geteri
	public long getId() {
		return id;
	}

	//Seteri
	public void setId() {
		id = counter++;
	}
	
	
	//Konstruktori
	public GuestUser() {
		setId();
	}
	//saja klase argumentu konstruktoru nevajag, jo nav user datu
	
	//toString
	public String toString() {
		String result = "" + id;
		return result;
	}
	
	//TO DO papildinat ar find servisiem
	

}
