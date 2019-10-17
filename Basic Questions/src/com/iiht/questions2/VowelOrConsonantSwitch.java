package com.iiht.questions2;

import java.util.Scanner;

public class VowelOrConsonantSwitch {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char alphabet =scan.next().charAt(0);
		switch(alphabet)
		{
		case 'a':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'e':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'i':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'o':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'u':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'A':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'E':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'I':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'O':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		case 'U':
		{
			System.out.println("Entered alphabet is vowel");
			break;
		}
		default:
		{
			System.out.println("Entered alphabet is consonant");
			break;
		}
		
		}
	}
}
