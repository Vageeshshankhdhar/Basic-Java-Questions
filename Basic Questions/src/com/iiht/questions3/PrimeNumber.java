package com.iiht.questions3;

import java.util.Scanner;

public class PrimeNumber {
private static Scanner scan;
	public static void main(String[] args) {
		scan =new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= scan.nextInt();
		int flag=0;
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				flag=1;
			}
		
		}
		if (flag==0) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}
	}

}
