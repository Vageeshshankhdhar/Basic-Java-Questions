package com.iiht.questions3;

import java.util.Scanner;

public class PrintArmstrongNumbersAsk {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int Onumber=scan.nextInt();
		int number = Onumber;
		int rem, res=0;
		while(number!=0)
		{
			rem=number%10;
			res+= Math.pow(rem, 3);
			number /= 10;
		}
		if(res==Onumber)
		{
			System.out.println("The given number is a Armstrong number");
		}
		if(res!=Onumber)
		{
			System.out.println("The given number is not a Armstrong number");
		}
	}
}
