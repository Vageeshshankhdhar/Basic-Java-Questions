package com.iiht.questions2;

import java.util.Scanner;

public class Result2 {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter marks in Physics : ");
		float Physics = scan.nextFloat();
		System.out.println("Enter marks in Chemistry : ");
		float Chemistry = scan.nextFloat();
		System.out.println("Enter marks in Biology : ");
		float Biology = scan.nextFloat();
		System.out.println("Enter marks in Mathematics : ");
		float Mathematics = scan.nextFloat();
		System.out.println("Enter marks in Computer : ");
		float Computer = scan.nextFloat();
		float total = Physics+Chemistry+Biology+Mathematics+Computer;
		float percentage = total/5;
		System.out.println("Percentage is : "+percentage+"%");
		if(percentage>=90)
		{
			System.out.println("And the grade is : A");
		}
		if(percentage>=80&&percentage<90)
		{
			System.out.println("And the grade is : B");
		}
		if(percentage>=70&&percentage<80)
		{
			System.out.println("And the grade is : C");
		}
		if(percentage>=60&&percentage<70)
		{
			System.out.println("And the grade is : D");
		}
		if(percentage>=40&&percentage<60)
		{
			System.out.println("And the grade is : E");
		}
		if(percentage<40)
		{
			System.out.println("And the grade is : F");
		}
	}
}
