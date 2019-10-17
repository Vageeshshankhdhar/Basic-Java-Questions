package com.iiht.questions2;

import java.util.Scanner;

public class NumberOfDaysInMonth {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the number of month :");
		int number=scan.nextInt();
	  
		if(number==1||number==3||number==5||number==7||number==8||number==10||number==12)
		{
			System.out.println("Total number of days are 31");
		}
		if(number==2)
		{
			System.out.println("Total number of days are 28");
			System.out.println("But total number of days in a leap year is 29");
		}
		if(number==4||number==6||number==9||number==11) 
		{
			System.out.println("Total number of days are 30");
		}
		if (number<1||number>12)
		{
			System.out.println("Incorrect Choice");
		}
	}

}
