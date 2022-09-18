package com.OOPSprogram;

public class LearningFinal {
	//final with varible
	final int speed=40;  						//we can't change value

	//final with class
	final class Automobiles{					//this class can't be extended by another class
		
		//final with method
		final void run() {
			System.out.println("Automobile features");
		}
		
		class Bike extends Automobiles{					//compile time error
			void run() {							//can't override final method in child class
				System.out.println("Bike features");
			}
	}
	}
	
	public static void main(String[] args) {
		LearningFinal fin=new LearningFinal();
		//fin.speed=100; 							//compile time error
		System.out.println(fin.speed);
		
		
	}

}
