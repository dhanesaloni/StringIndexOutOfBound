package com.Practical;

public class ABC {
	
	String Username;
	String Email;
	String Contact;
	String Adress;
	String Profile;
	
	public ABC(String Username ,String Email , String Contact , String Adress,String Profile)
	{
		this.Username = Username;
		this.Email = Email;
		this.Contact = Contact;
		this.Adress = Adress;
		this.Profile = Profile;
		
	}
	
	 public ABC(String UserName , String Email){
			this.Username = UserName;
			this.Email = Email;
		}
	 
	void display() {
	        System.out.println("Username: " +Username);
	        System.out.println("Email: " +Email);
	        System.out.println("Contact: " +Contact);
	        System.out.println("Adress: " +Adress); 
	        System.out.println("Profile: " +Profile);
	        
	}
	
	void show() {
		 System.out.println("Username: " +Username);
	        System.out.println("Email: " +Email);
		
	}
	

	public static void main(String[] args) {
		ABC a1 = new ABC("Priya","salnidhane32@gmail.com","45792","pune","developer");
		ABC a = new ABC("Saloni","saloni@12gmail.com");
		
		
		a1.display();
		a.show();
		
		
		

	}

}
