package com.iiht.questions3;

import java.util.Scanner;

class PrimeFactorsOfNumbers {
	private static Scanner scan;
	public static void primeFactors(int n){
		while(n%2==0)
		{
			System.out.print(2+" ");
			n/=2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n/=i;
			}
		}
		if(n>2)
		{
			System.out.print(n);
		}
	}
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a =scan.nextInt();
		primeFactors(a);
	}
}
