package com.iiht.questions2;

import java.util.Scanner;

public class ProfitOrLoss {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the sales price: ");
		double SP = scan.nextDouble();
		System.out.println("Enter the cost price : ");
		double CP = scan.nextDouble();
		if (SP==CP)
		{
			System.out.println("No profit or loss");
		}
		if (SP<CP)
		{
			double loss = CP-SP;
			System.out.println("Loss is : "+loss);
		}
		if (SP>CP)
		{
			double profit = SP-CP;
			System.out.println("Profit is : "+profit);
		}
	}
}
