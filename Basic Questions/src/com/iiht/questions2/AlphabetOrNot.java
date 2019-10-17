package com.iiht.questions2;

import java.util.Scanner;

public class AlphabetOrNot {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char alphabet =scan.next().charAt(0);
		if(alphabet>='a'&&alphabet<='z'||alphabet>='A'&&alphabet<='Z')
		{
			System.out.println("Entered character is alphabet");
		}
		else
		{
			System.out.println("Entered character is not alphabet");
		}
	}
}
