package com.iiht.questions3;

import java.util.Scanner;

public class LCM {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		System.out.println("Enter value of b : ");
		int b =scan.nextInt();
		int hcf = 1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if (a%i==0&&b%i==0)
			{
				hcf = i;
			}
		}
		int LCM = (a*b)/hcf;
		System.out.println("The LCM is = "+LCM);
	}
}
