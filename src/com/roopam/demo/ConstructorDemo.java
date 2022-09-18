package com.roopam.demo;

public class ConstructorDemo 
{
	ConstructorDemo()
	{
		System.out.println("Default Constructor Demo");
	}
	ConstructorDemo(int a)
	{
		System.out.println("Param Constructor Demo");
	}
	
		
	public static void main(String[] args) {
		System.out.println("Learning Constructor");
		
		new ConstructorDemo();
		
		new ConstructorDemo(23);
	}
		
	

}
