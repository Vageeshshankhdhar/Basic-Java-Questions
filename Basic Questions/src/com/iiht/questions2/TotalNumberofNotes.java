package com.iiht.questions2;

import java.util.Scanner;

public class TotalNumberofNotes {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the total amount : ");
		int total = scan.nextInt();
		System.out.println("Enter the value of a single note : ");
		int value = scan.nextInt();
		int notes = total/value;
		System.out.println("Total number of notes in amount is : "+notes);
		
	}
}
