package com.roopam.demo;

public class StaticVariable {
	
	//static variables
	public static String name;
	public static int age;
	double sal;
	
	//static method-----one way to call non static varible in static method1
	public static void method1() {
		name= "John";
		age=23;
		StaticVariable s= new StaticVariable();
	    s.sal=5945.5; //with the help of s we can all the sal variable
	    System.out.println("Name:"+ name+ ", Age:"+age+", Salary:"+s.sal);
	}
	
	//static method(other way to call NS var)-----we have to pass classtype variable as a parameter to the method2
	public static void method2(StaticVariable abc) {
		name= "Rohn";
	    //abc.age=25;
	    abc.sal=age*1000; //with the help of s1 we can all the sal variable
	    
	}

	public static void main(String[] args) {
		
		method1();
		
		StaticVariable s1= new StaticVariable();
		StaticVariable.age=25;
		StaticVariable.method2(s1);
		System.out.println("Name:"+ name+ ", Age:"+age+", Salary:"+s1.sal);
		
		StaticVariable s2= new StaticVariable();
		StaticVariable.age=36;
		StaticVariable.method2(s2);
		System.out.println("Name:"+ name+ ", Age:"+age+", Salary:"+s2.sal);
		
	}

}