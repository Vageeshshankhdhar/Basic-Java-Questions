package com.iiht.questions2;

import java.util.Scanner;

public class WeekDay {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the number of day in week :");
		int number=scan.nextInt();
	  
		if(number==1)
		{
			System.out.println("The day is Monday");
		}
		if(number==2)
		{
			System.out.println("The day is Tuesday");
		}
		if(number==3) 
		{
			System.out.println("The day is Wednesday");
		}
		if(number==4) 
		{
			System.out.println("The day is Thursday");
		}
		if(number==5)
		{
			System.out.println("The day is Friday");
		}
		if(number==6) 
		{
			System.out.println("The day is Saturday");
		}
		if(number==7) 
		{
			System.out.println("The day is Sunday");
		}
		if (number<1||number>7)
		{
			System.out.println("Incorrect Choice");
		}
	}

}
