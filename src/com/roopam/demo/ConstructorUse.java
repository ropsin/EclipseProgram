package com.roopam.demo;

public class ConstructorUse {
	String name;
	int age;
	int rollnum;
	
	//we can initialize all the non static variables using constructor(this is the main use of constructor)
	
	ConstructorUse(String n,int a, int r)
	{
		name=n;
		age=a;
		rollnum=r;
	}
	public String display()
	{
		return "[Name:" + name + " " +"Age:" + age + " "+ "Roll no:" + rollnum +"]" ;
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("*List of Students details*");
		 ConstructorUse c1=new ConstructorUse("Roopam",40, 522);
		 System.out.println(c1.display());
		ConstructorUse c2=new ConstructorUse("Dipti",39, 521);
		 System.out.println(c2.display());
		ConstructorUse c3=new ConstructorUse("Hitesh",35, 520);
		 System.out.println(c3.display());
		 
		
		
	
	}

}
