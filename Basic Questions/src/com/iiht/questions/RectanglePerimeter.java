package com.iiht.questions;

import java.util.Scanner;

public class RectanglePerimeter {

	
		private static Scanner scan;
		public static void main(String[] args) {
			scan = new Scanner(System.in);
			System.out.println("Enter value of length : ");
			int length =scan.nextInt();
			System.out.println("Enter value of breadth : ");
			int breadth =scan.nextInt();
			int perimeter = 2*(length+breadth);
			System.out.println("Perimeter of rectangle is : "+perimeter);
		
	}

}
