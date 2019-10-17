package com.iiht.questions2;

import java.util.Scanner;

public class SalaryCalculator {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter basic salary :");
		int basic_salary=scan.nextInt();
	    if(basic_salary>=10000&&basic_salary<20000)
	    {
			float HRA = (2*basic_salary)/10;
			float DA = (8*basic_salary)/10;
			double gross_salary = basic_salary+HRA+DA;
	    	System.out.println("Gross Salary is : "+gross_salary);
		}
	    if(basic_salary>=20000&&basic_salary<30000)
	    {
			float HRA = (25*basic_salary)/100;
			float DA = (9*basic_salary)/10;
			double gross_salary = basic_salary+HRA+DA;
	    	System.out.println("Gross Salary is : "+gross_salary);
		}
		if(basic_salary>=30000)
	    {
			float HRA = (3*basic_salary)/10;
			float DA = (95*basic_salary)/100;
			double gross_salary = basic_salary+HRA+DA;
	    	System.out.println("Gross Salary is : "+gross_salary);
	    }
	}
}
