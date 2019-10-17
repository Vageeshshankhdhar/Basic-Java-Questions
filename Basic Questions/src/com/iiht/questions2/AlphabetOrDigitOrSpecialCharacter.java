package com.iiht.questions2;

import java.util.Scanner;

public class AlphabetOrDigitOrSpecialCharacter {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char alphabet =scan.next().charAt(0);
		if(alphabet>=65&&alphabet<=123)
		{
			System.out.println("Entered character is alphabet");
		}
		if(alphabet>=48&&alphabet<=57)
		{
			System.out.println("Entered character is digit");
		}
		else
		{
			System.out.println("Entered character is special character");
		}
	}
}
