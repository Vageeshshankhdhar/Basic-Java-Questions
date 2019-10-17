package com.iiht.questions3;

public class EvenNumbers {
	public static void main(String[] args) {
		System.out.println("Even Numbers from 1 to 100 are : ");
		
	    for(int i=1;i<=100;i++)
	    {
	    	int rem = i%2;
	    	if(rem==0)
	    	{
		    	System.out.print(i+" ");
	    	}
	    }
	}
}
