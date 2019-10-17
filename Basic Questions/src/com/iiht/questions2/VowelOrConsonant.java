package com.iiht.questions2;

import java.util.Scanner;

public class VowelOrConsonant {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char alphabet =scan.next().charAt(0);
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'||alphabet=='A'
				||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
		{
			System.out.println("Entered alphabet is vowel");
		}
		else
		{
			System.out.println("Entered alphabet is consonant");
		}
	}
}
