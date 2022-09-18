package com.roopam.demo;

public class ConstructorOverload {
	
	 public ConstructorOverload()
	{
		System.out.println("This is Default Constructor!");
	}
	public ConstructorOverload(int a)
	{
		this();
		System.out.println("This is Parameterised Constructor with 1 parameter!");
	}
	public ConstructorOverload(int a, double d)
	{
		this(4983);
		System.out.println("This is Parameterised Constructor with 2 parameters!");
	}
	public ConstructorOverload(char c, String s, boolean b)
	{
		this(23,50.05);
		System.out.println("This is Parameterised Constructor with 3 parameters!");
	}

	public static void main(String[] args) {
		System.out.println("This is an example of Constructor Overloading");
		
		//ConstructorOverload con1=new ConstructorOverload();
		//ConstructorOverload con2=new ConstructorOverload(34);
		//ConstructorOverload con3=new ConstructorOverload(45,79.9);
		
		//instead of calling constructor by objects multiple time is not good for memory
		//so we will use this() statement to call one constructor from other
		//so we create only one object and use this() statement
		
		//ConstructorOverload con4=new ConstructorOverload('R',"Roopam",true);

	}

}
