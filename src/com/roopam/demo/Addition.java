package com.roopam.demo;

public class Addition {
	public static void Add(int a,double b)
	{
	double sum=a+b;
	System.out.println("Sum=" +sum);
	double diff=a-b;
	System.out.println("Difference=" +diff);
	double prod=a*b;
	System.out.println("Product=" +prod);
	double div=a/b;
	System.out.println("Quotient if 1st number is divided by the 2nd number=" +div);
	double mod=a%b;
	System.out.println("Remainder if 1st number is divided by the 2nd number=" +mod);
	
	}

	public static void main(String[] args) {
		System.out.println("Main Starts"); 
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a=scn.nextInt();
		System.out.println("Enter the 2nd number:");
		double b=scn.nextDouble();
		Add(a,b);
		System.out.println("Main Ends");
		
		scn.close();	
		
	}

}
