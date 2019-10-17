package com.iiht.questions3;

import java.util.Scanner;

public class FibonacciSeries {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number upto which Fibonacci series is to be printed : ");
		int number =scan.nextInt();
		int t1=0,t2=1;
		for(int i=1;i<=number;i++)
		{
			System.out.print(t1+" + ");
			int sum =t1+t2;
			t1 =t2;
			t2=sum;
		}
	}
}
