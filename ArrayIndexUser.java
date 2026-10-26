package com.Practical;
import java.util.Scanner;

public class ArrayIndexUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				System.out.println("enter the array size:");
				int n=sc.nextInt();
				System.out.println("enter the array element");
				int arr[]=new int[n];
				
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
					System.out.println(arr[i]);
					
				}
				for(int i=0;i<arr.length;i++)
				{
					try {
					
					System.out.println(arr[6]);
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println(e);
					}
					
					
				}
				
				System.out.println("after catch");
				
			}


	}

}
