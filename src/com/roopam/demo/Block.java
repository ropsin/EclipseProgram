package com.roopam.demo;

public class Block 
{
	static String name;
	int age;
//Blocks in Java
	//1.Static block or Static Initialization Block(SIB) no need to call in main method
	//2.Non-Static Block or  Non-Static Initialization Block (N-SIB) , need to call by creating object, will execute at that time only
	
	static
	{
		name="Roopam";
		System.out.println("Static Block creation1");
		System.out.println(name);
	}
	static
	{
		name="Khank";
		System.out.println("Static Block creation2");
		System.out.println(name);
	}
	static
	{
		name="Hitee";
		System.out.println("Static Block creation3");
		System.out.println(name);
	}
	public Block()
	{
		System.out.println("Construction creation");
	}

	//Non-Static Block
	{
		age=1;
		System.out.println("Non-Static Block creation1" + " " +age);
	}
	{
		age=2;
		System.out.println("Non-Static Block creation2"+ " " +age);
	}
	{
		age=3;
		System.out.println("Non-Static Block creation3"+ " " +age);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		System.out.println("Main Ends");
		
		//Block b=new Block();  //Non static block will be executed only after creation of its object, observe the sequence when its executing
		
		
	}
}
