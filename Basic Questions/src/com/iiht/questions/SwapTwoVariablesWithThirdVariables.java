package com.iiht.questions;

import java.util.Scanner;

public class SwapTwoVariablesWithThirdVariables {

		private static Scanner scan;
		public static void main(String[] args) {
			scan = new Scanner(System.in);
			System.out.println("Enter value of a : ");
			int a =scan.nextInt();
			System.out.println("Enter value of b : ");
			int b =scan.nextInt();
			System.out.println("Value of a before swapping : "+a);
			System.out.println("Value of b before swapping : "+b);
			int t=0;
			t=a;
			a=b;
			b=t;
			System.out.println("Value of a after swapping : "+a);
			System.out.println("Value of b after swapping : "+b);
	}

}
