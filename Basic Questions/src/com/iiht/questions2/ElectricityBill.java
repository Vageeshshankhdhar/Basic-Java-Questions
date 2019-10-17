package com.iiht.questions2;

import java.util.Scanner;

public class ElectricityBill {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter number of units :");
		float units=scan.nextFloat();
	    double bill;
		if(units<=50) {
			bill = units*(0.5);
			System.out.println("The bill is : "+bill);
		}
		if(units<=150&&units>50)
		{
			float temp = units-50;
			bill= (50*(0.5)) + (temp*(0.75));
			System.out.println("The bill is : "+bill);
		}
		if(units<=250&&units>150)
		{
			float temp = units-150;
			bill= (50*(0.5)) + (100*(0.75))+(temp*(1.20));
			System.out.println("The bill is : "+bill);
		}
		if(units>250)
		{
			float temp = units-250;
			bill= (50*(0.5)) + (100*(0.75))+(100*(1.20))+(temp*(1.50));
			double tax = (2*bill)/10;
			double total_bill = bill+tax;
			System.out.println("The bill is : "+total_bill);
		}
	}
}
