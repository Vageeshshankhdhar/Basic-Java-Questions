package com.iiht.questions;

import java.util.Scanner;

public class SwapTwoVariablesWithoutThirdVariables {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		System.out.println("Enter value of b : ");
		int b =scan.nextInt();
		System.out.println("Value of a before swapping : "+a);
		System.out.println("Value of b before swapping : "+b);
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("Value of a after swapping : "+a);
		System.out.println("Value of b after swapping : "+b);
	}
}
