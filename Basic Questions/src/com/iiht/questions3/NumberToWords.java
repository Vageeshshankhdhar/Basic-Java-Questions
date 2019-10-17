package com.iiht.questions3;

import java.util.Scanner;

public class NumberToWords {
	private static Scanner scan;
	public static void main(String[] args) {
	scan = new Scanner(System.in);
	System.out.println("Enter a number :");
	int number=scan.nextInt();
	int reversed =0;
	int n;
	while(number!=0)
	{
		int digit = number%10;
		 reversed = reversed*10+digit;
		number = number/10;
	}
    while(reversed>0)
    {
     n = reversed%10;
     reversed=reversed/10;
     switch(n)
     {
     case 1:
     {
    	 System.out.print(" One ");
    	 break;
     }
     case 2:
     {
    	 System.out.print(" Two ");
    	 break;
     }
     case 3:
     {
    	 System.out.print(" Three ");
    	 break;
     }
     case 4:
     {
    	 System.out.print(" Four ");
    	 break;
     }
     case 5:
     {
    	 System.out.print(" Five ");
    	 break;
     }
     case 6:
     {
    	 System.out.print(" Six ");
    	 break;
     }
     case 7:
     {
    	 System.out.print(" Seven ");
    	 break;
     }
     case 8:
     {
    	 System.out.print(" Eight ");
    	 break;
     }
     case 9:
     {
    	 System.out.print(" Nine ");
    	 break;
     }
     case 0:
     {
    	 System.out.print(" Zero ");
    	 break;
     }
    }
}
}
	}

