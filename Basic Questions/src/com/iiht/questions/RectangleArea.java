package com.iiht.questions;

import java.util.Scanner;

public class RectangleArea {

	
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of length : ");
		int length =scan.nextInt();
		System.out.println("Enter value of breadth : ");
		int breadth =scan.nextInt();
		int area = length*breadth;
		System.out.println("Area of rectangle is : "+area);
	
}

}
