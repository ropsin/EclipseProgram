package com.OOPSprogram;

public class Binding {
public static void main(String[] args) {
		
		//Upcasting in Java ==== we cannot call sub class method or variable
		A1 a1=new B1(); 			
		//method calling
		//Binding- connecting method called to method implementation in Java
		//1. Static binding/Compile-time binding(done by compiler)----occurs only for static/private/final members
		//2. Non-Static/Dynamic binding/Run-time binding(done by JRE)----occurs for non-static/non-private/non final members
		a1.m1();
		//A1 a1=new C1();
		
		B1 b1=new C1();
		b1.m1();
		b1.m2();
		
		
		//Downcasting in Java
		if(b1 instanceof C1) {
			C1 c1= (C1)b1;				//we are doing typecasting here and storing it in sub class reference variable
			c1.m1();
			c1.m2();
			c1.m3(); // we can call sub class method or variable === by downcasting
		}
		
			
	}


}
	
	class A1 {
		
		//method implementation
		public static void m1() {
			
			System.out.println("m1 method");
		}
	}
	
	

	class B1 extends A1 {
		public static void m2() {
			
			System.out.println("m2 method");
		}
	}
	

	class C1 extends B1 {
		public static void m3() {
			
			System.out.println("m3 method");
		}
	}
	
