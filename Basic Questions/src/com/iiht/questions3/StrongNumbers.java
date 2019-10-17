package com.iiht.questions3;

import java.util.Scanner;

public class StrongNumbers {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number =scan.nextInt();
		int temp = number;
		int Fact,i,rem,sum=0;
		while(temp>0)
		{
			Fact = 1;
			i = 1;
			rem = temp%10;
			while(i<=rem)
			{
				Fact = Fact*i;
				i++;
			}
			System.out.println("The Factorial of "+rem+" = "+Fact);
			sum =sum+Fact;
			temp = temp/10;
		}
		System.out.println("The sum of factorials = "+sum);
		if(sum==number)
		{
			System.out.println("Given number is Strong");
		}
		else
		{
			System.out.println("Given number is not Strong");
		}
	}
}
