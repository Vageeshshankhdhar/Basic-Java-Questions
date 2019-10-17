package com.iiht.questions3;

import java.util.Scanner;

public class NaturalNumbers2 {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
	    for(int i=number;i>=1;i--)
	    {
	    	System.out.print(i+" ");
	    }
	}
}
