package com.iiht.questions;

import java.util.Scanner;

public class AverageOfThreeNumbers {

		private static Scanner scan;
		public static void main(String[] args) {
			scan = new Scanner(System.in);
			System.out.println("Enter value of a : ");
			int a =scan.nextInt();
			System.out.println("Enter value of b : ");
			int b =scan.nextInt();
			System.out.println("Enter value of c : ");
			int c =scan.nextInt();
			int average = (a+b+c)/3;
			System.out.println("The average is : "+average);

	}

}
