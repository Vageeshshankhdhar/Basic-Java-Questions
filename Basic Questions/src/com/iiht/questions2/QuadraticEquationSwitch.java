package com.iiht.questions2;

import java.util.Scanner;

public class QuadraticEquationSwitch {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Given quadratic equation : a*x^2+b*x+c");
		System.out.println("Enter the value of a : ");
		int a = scan.nextInt();
		System.out.println("Enter the value of b : ");
		int b = scan.nextInt();
		System.out.println("Enter the value of c : ");
		int c = scan.nextInt();
		double d = (b*b)-(4*a*c);
		double Firstroot , Secondroot;
		int flag = 0;
		if(d>0)
		{
			flag=0;
		}
		if(d==0)
		{
			flag=1;
		}
		if(d<0)
		{
			flag=2;
		}
		switch(flag)
		{
		case 0:
		{
			System.out.println("Roots are real and distinct.");
			Firstroot = (-b+Math.sqrt(d))/(2*a);
			Secondroot = (-b-Math.sqrt(d))/(2*a);
			System.out.println("First root is : "+Firstroot);
			System.out.println("Second root is : "+Secondroot);
			break;
		}
		case 1:
		{
			System.out.println("Roots are real and equal.");
			Firstroot = (-b+Math.sqrt(d))/(2*a);
			System.out.println("Root is : "+Firstroot);
			break;
		}
		case 2:
		{
			System.out.println("Roots are imaginary.");
			break;
		}
		}
	}
}
