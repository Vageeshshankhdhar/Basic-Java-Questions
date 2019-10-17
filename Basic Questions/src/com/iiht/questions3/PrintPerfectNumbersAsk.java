package com.iiht.questions3;

import java.util.Scanner;

public class PrintPerfectNumbersAsk {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum==a)
		{
			System.out.println("Given number is Perfect");
		}
		else
		{
			System.out.println("Given number is not Perfect");
		}
	}

}
