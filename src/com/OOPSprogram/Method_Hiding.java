package com.OOPSprogram;

public class Method_Hiding {

	
		public static void demo1() {
			System.out.println("Demo1 in Method_Hiding");
		}
		public static void demo2() {
			System.out.println("Demo2 in Method_Hiding");
		}
		public static void demo3() {
			System.out.println("Demo3 in Method_Hiding");
		}
		public static void main(String[] args) {
			 
			//MethodHiding_sub sub=new MethodHiding_sub();
			Method_Hiding.demo1();
	}
}
	 class MethodHiding_sub extends Method_Hiding {
		
		public static void demo1() {
			System.out.println("Demo1 in MethodHiding_sub");
		}
		public static void demo2() {
			System.out.println("Demo2 in MethodHiding");
		}
		
		public static void demo3() {
			System.out.println("Demo3 in MethodHiding");
		}
		
	
	}