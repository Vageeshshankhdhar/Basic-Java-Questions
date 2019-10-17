package com.iiht.questions;

import java.util.Scanner;

public class ArithmeticOperations {
private static Scanner scan;
		public static void main(String[] args) {
			scan = new Scanner(System.in);
			System.out.println("Enter value of a : ");
			int a =scan.nextInt();
			System.out.println("Enter value of b : ");
			int b =scan.nextInt();
			int c = a+b;
			int d = a-b;
			int e = a*b;
			int f = a/b;
			int g = b%a;
			System.out.println("Add is : "+c);
			System.out.println("Subtraction is : "+d);
			System.out.println("Multiplication is : "+e);
			System.out.println("Division is : "+f);
			System.out.println("Modulus is : "+g);

		}
	}