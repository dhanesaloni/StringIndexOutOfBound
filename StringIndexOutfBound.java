package com.Practical;

public class StringIndexOutfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String name = "Saloni";

	        try {
	            System.out.println(name.charAt(5));
	        }
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println(e);
	        }

	        System.out.println("after catch");

	}

}
