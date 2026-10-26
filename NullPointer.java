package com.Practical;
import java.util.Scanner;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		System.out.println(str);
		
		 try {
	            System.out.println("Length :"+str.length());
	 
	        }
		 
	        catch (NullPointerException e) {
	            System.out.println(e);
	        }
		 System.out.println("outside catch");
	    }
			


	}


