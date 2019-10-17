package com.iiht.questions2;

import java.util.Scanner;

public class EvenorOddSwitch {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
	    int rem=number%2;
	    switch(rem)
	    {
	    	case 1:
	    	{
			System.out.println("Entered number is odd");
			break;
	    	}
	    	default:
	    	{
			System.out.println("Entered number is even");
	    	}
	    }
	}
}
