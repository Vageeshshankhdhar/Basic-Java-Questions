package com.iiht.questions2;

import java.util.Scanner;

public class MaxBtw2Numbers {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		System.out.println("Enter value of b : ");
		int b =scan.nextInt();
		if(a<b)
		{
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("a is greater than b");
		}
	}
}
