package com.iiht.questions2;

import java.util.Scanner;

public class MaxBtw3Numbers {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		System.out.println("Enter value of b : ");
		int b =scan.nextInt();
		System.out.println("Enter value of c : ");
		int c =scan.nextInt();
		if(a<b)
		{
			if(c<b)
			{
			System.out.println("b is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
		if(a>b)
		{
			if(c<a)
			{
			System.out.println("a is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
	}
}
