package com.iiht.questions3;

import java.util.Scanner;

public class Table {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number whose table is to be printed :");
		int number=scan.nextInt();
	    for(int i=1;i<=10;i++)
	    {
	    	int c = number*i;
	    	System.out.println(number+" x "+i+" = "+c);
	    	System.out.println(" ");
	    }
	}
}
