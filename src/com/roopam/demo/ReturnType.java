package com.roopam.demo;

public class ReturnType {
	public static int Add(int a, int b)
	{
		//int sum=a+b; 
		 // return sum;
		return a+b;
		
	}
	public static String StudentInfo(String name, int age, char b, String sub)
	{
		return "Name:"+name+", Age:"+age+ ", Gender:" + b+ ", Subject:"+ sub;
		
	}
	
		public static boolean Status(boolean status)
		{
			return status; 
		}
			public static double Product(double a, int b)
			{
			
				return a*b;
				
			}
					
		
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int s=Add(20,30);
		System.out.println("Sum=" +s);
		
		double d=Product(39.765, 65);
		System.out.println("Product=" +d);
		
		String str=StudentInfo("Roopam", 40,'F',"Java");
		System.out.println(str);
		
		System.out.println(Status(true));
		
		System.out.println("Main Ends");

	}

}
