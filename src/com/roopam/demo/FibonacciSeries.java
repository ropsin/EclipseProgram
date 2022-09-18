package com.roopam.demo;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter series number:");
        int n=sc.nextInt();
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        
        for(int i=1; i<=n; i++)
        {
        	int c=a+b;
        	System.out.print(c+ " ");
        	a=b; b=c;
        }
        sc.close();
	}

}
