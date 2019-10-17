package com.iiht.questions3;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPrimeNumbers {
	private static Scanner scan;
	static int sumOfPrimes(int n)
	{
		//Array to store prime numbers
		boolean prime[]=new boolean[n+1];
		//Create a boolean array "prime[0..n]"
		//and initialize all entries it as true
		//A value in prime[i] will finally be false if i is not a prime, else true.
		Arrays.fill(prime,true);
		for(int p=2;p*p<=n;p++)
		{
			//If prime[p] is not changed , then it is a prime.
			if(prime[p]==true)
			{
				//updates all multiple of p
				for(int i=p*2;i<=n;i+=p)
				{
					prime[i]=false;
				}
			}
		}
		//Return sum of primes generated by Sieve.
		int sum=0;
		for (int i=2;i<=n;i++)
		{
			if(prime[i])
			{
				sum+=i;
			}
		}
		return sum;
	}
	//Driver Code
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number =scan.nextInt();
		System.out.println(sumOfPrimes(number));
	}
}
