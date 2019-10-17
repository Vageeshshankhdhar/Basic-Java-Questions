package com.iiht.questions;

import java.util.Scanner;

public class AddTwoNumbersWithoutThirdVariable {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		System.out.println("Enter value of b : ");
		int b =scan.nextInt();
		
		System.out.println("a+b ="+(a+b));
	}
}
