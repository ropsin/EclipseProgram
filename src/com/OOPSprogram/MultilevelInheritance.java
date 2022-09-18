package com.OOPSprogram;

public class MultilevelInheritance {

	public static void main(String[] args){
		B b=new B();
		b.display1();
		b.display2();
		C c=new C();
		c.display1();
		c.display2();
		c.display3();
		D d=new D();
		d.display1();
		d.display2();
		d.display4();
	}
}
	class A {
		void display1(){
			System.out.println("Class A Method");
	}
	}
		
		//Single level inheritance in Java
	class B extends A{
		void display2(){
			System.out.println("Class B Method");
	}
	}
	
		//Multilevel inheritance in Java
	
	class C extends B{
		void display3() {
			System.out.println("Class C Method");
		}
	}
	
		//Hierarchical Inheritance===== single class is extended by multiple class
	class D extends B
	{
		void display4() {
			System.out.println("Class D Method");
		}
	}	


