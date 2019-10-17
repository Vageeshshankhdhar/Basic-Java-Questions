package com.iiht.questions2;

import java.util.Scanner;

public class MaxBtw2NumbersSwitch {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		System.out.println("Enter value of b : ");
		int b =scan.nextInt();
		int flag;
		if(a<b)
		{
			flag=0;
		}
		else
		{
			flag=1;
		}
		switch(flag)
		{
		case 0:
		{
			System.out.println("b is max.");
			break;
		}
		case 1:
		{
			System.out.println("a is max.");
			break;
		}
		}
	}
}
