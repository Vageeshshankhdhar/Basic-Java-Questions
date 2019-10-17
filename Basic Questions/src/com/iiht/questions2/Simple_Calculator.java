package com.iiht.questions2;

import java.util.Scanner;

public class Simple_Calculator {
	private static Scanner scan;
	private static Scanner scan1;
	private static Scanner scan2;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Enter a number x :");
		int x= scan.nextInt();
		System.out.println("The x has a value : "+x);
		 
		scan1 = new Scanner(System.in);
		System.out.println("Enter a number y :");
		int y= scan1.nextInt();
		System.out.println("The y has a value : "+y);

		System.out.println("**************Calculator****************");
		System.out.println("1.Addition\n2.Subtraction\n3.Product\n4.Division\n5.Modulus");
		System.out.println("****************************************");
	

		scan2 = new Scanner(System.in);
		System.out.println("Enter choice :");
		int choice= scan2.nextInt();
		System.out.println("You choose option : "+choice);	
		
		switch (choice) {
		case 1:
		{
			int sum = x+y;
			 System.out.println("Sum is : "+sum);
		}
			break;
		case 2:
			{
				int difference = x-y;
			System.out.println("Difference is : "+difference);
			}
			break;
		case 3:
		{
			int product = x*y;
			System.out.println("Product is : "+product);
		}
			break;
		case 4:
		{
			double division = x/y;
			System.out.println("Division is : "+division);
		}
			break;
		case 5:
		{
			int modulus = x%y;
			System.out.println("Modulus is : "+modulus);
		}
			break;
		default:
		{
			System.out.println("Enter a valid choice");
		}
			break;
		}
		
	}

}
