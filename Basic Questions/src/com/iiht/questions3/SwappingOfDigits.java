package com.iiht.questions3;

import java.util.Scanner;

public class SwappingOfDigits {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		int output = reverse(number);
		System.out.println("Output is : "+output);
	}
	public static int reverse (int number)
	{
		String inputString = String.valueOf(number);
		String outputString = null;
		if(inputString.length()==1)
		{
			outputString = inputString;
		}
		else
		{
			char firstChar = inputString.charAt(0);
			char lastChar = inputString.charAt(inputString.length()-1);
			String remaining = inputString.substring(1, inputString.length()-1);
			outputString = lastChar + remaining + firstChar;
		}
		int output = Integer.parseInt(outputString);
		return output;
		
	}
}
