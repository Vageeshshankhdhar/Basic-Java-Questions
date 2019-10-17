package com.iiht.questions3;

import java.util.Scanner;

public class Palindrome {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int Onumber=scan.nextInt();
		int number = Onumber;
		int reversed =0;
		while(number!=0)
		{
			int digit = number%10;
			reversed = reversed*10+digit;
			number = number/10;
		}
		if(reversed==Onumber)
		{
			System.out.println("The number is Palindrome");
		}
		if(reversed!=Onumber)
		{
			System.out.println("The number is not Palindrome");
		}
	}
}
