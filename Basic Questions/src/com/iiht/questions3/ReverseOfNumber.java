package com.iiht.questions3;

import java.util.Scanner;

public class ReverseOfNumber {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		int reversed =0;
		while(number!=0)
		{
			int digit = number%10;
			reversed = reversed*10+digit;
			number = number/10;
		}
		System.out.println("Reverse of given number is : "+reversed);
	}
}
