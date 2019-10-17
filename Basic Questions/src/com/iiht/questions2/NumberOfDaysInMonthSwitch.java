package com.iiht.questions2;

import java.util.Scanner;

public class NumberOfDaysInMonthSwitch {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the number of month :");
		int number=scan.nextInt();
	  switch(number)
	  {
	  case 1:
	  {
			System.out.println("Total number of days are 31");
			break;
	  }
	  case 2:
	  {
			System.out.println("Total number of days are 28");
			System.out.println("But total number of days in a leap year is 29");
			break;
	  }
	  case 3:
	  {
			System.out.println("Total number of days are 31");
			break;
	  }
	  case 4:
	  {
			System.out.println("Total number of days are 30");
			break;
	  }
	  case 5:
	  {
			System.out.println("Total number of days are 31");
			break;
	  }
	  case 6:
	  {
			System.out.println("Total number of days are 30");
			break;
	  }
	  case 7:
	  {
			System.out.println("Total number of days are 31");
			break;
	  }
	  case 8:
	  {
			System.out.println("Total number of days are 31");
			break;
	  }
	  case 9:
	  {
			System.out.println("Total number of days are 30");
			break;
	  } 
	  case 10:
	  {
			System.out.println("Total number of days are 31");
			break;
	  }
	  case 11:
	  {
			System.out.println("Total number of days are 30");
			break;
	  } 
	  case 12:
	  {
			System.out.println("Total number of days are 31");
			break;
	  }
	  default:
	  {
			System.out.println("Incorrect Choice");
			break;
	  }
		}
	}
}
