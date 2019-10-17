package com.iiht.questions;

import java.util.Scanner;

public class AreaOfTriangle {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter height of triangle : ");
		double height = scan.nextDouble();
		System.out.println("Enter base of triangle : ");
		double base = scan.nextDouble();
		double area = (height*base)/2;
		System.out.println("Area of triangle is : "+area);
	}
}
