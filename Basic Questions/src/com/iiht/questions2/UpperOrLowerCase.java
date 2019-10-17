package com.iiht.questions2;

import java.util.Scanner;

public class UpperOrLowerCase {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char alphabet =scan.next().charAt(0);
		if(alphabet>=65&&alphabet<=90)
		{
			System.out.println("Upper Case");
		}
		if(alphabet>=97&&alphabet<=122)
		{
			System.out.println("Lower Case");
		}
		
	}
}
