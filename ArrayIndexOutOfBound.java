package com.Practical;


public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"salni","shruti","vaishi"};
		
		try {
			for(int i = 0;i<4;i++)
			{
				System.out.println(arr[i]+"\t");
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		

	}

}
