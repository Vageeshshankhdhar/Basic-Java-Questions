package com.iiht.questions3;

import java.util.Scanner;

public class PowerOfNumber {

	private static Scanner scan;

	public static void main(String[] args) {
		 scan = new Scanner(System.in);
		System.out.println("Enter a positive number :");
		int number=scan.nextInt();
		System.out.println("Enter power of number :");
		int power=scan.nextInt();
		int result = 1;
		for (int i=1;i<=power;i++)
		{
			if(power>=1&&number>0) 
			{
			result = result*number;
			}
			if(power>=1&&number==0)
			{
				result=0;
			}
			if(power==0)
			{
				result = 1;
			}
		}
	System.out.println("The result is "+result);
	}

}
