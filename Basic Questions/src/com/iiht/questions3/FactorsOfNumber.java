package com.iiht.questions3;

import java.util.Scanner;

public class FactorsOfNumber {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		System.out.println("The Factor of given number are : ");
		for (int i=1;i<=number;i++)
		{
			int rem =number%i;
			if(rem==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
