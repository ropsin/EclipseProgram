package com.OOPSprogram;
 class Animal{
	 String color="Null";
	 
	 void showcolor() {
		 System.out.println(color);
	 }
	 void eat() {
		 System.out.println("Eating habits");
	 }
	 
	 Animal(){
		 System.out.println("Animal is created");
	 }
 }
 
class Dog extends Animal {
	 String color="White";
	 
	 void displaycolor() {
		 System.out.println(super.color); // super keyword calls its(Dog) immediate super class(Animal) instance variable
		 System.out.println(color);
	 }
	 void eat() {
		 
		 System.out.println("Dog eats pedigree");
		 super.eat();  //invokes immediate(Animal)class method
	 }
	 
	 Dog(){
		 super(); 	//there's no need to add this bcoz java will automatically add all default constructs when an object is created
		 			//we can still add it explicitly if we want. in both case sub class n its imm. super class constructor will invoke
		 			//but we its mandatory to explicitly mention it for parameterized constructor, otherwise it will call default
		 System.out.println("Dog is created");
	 }
}

class Cat extends Dog {
	 String color="Black";
	 
	 void printcolor() {
		 System.out.println(super.color);  // super keyword calls its(Cat) immediate super class(Dog) instance variable
		 System.out.println(color); 
	 }
	 void eat() {
		
		 super.eat();
		 System.out.println("Cat eats mouse");
	}
	 
	 Cat(){
		 super(); 
		 System.out.println("Cat is created");
	 }
}

public class LearningSuper {

	public static void main(String[] args) {
		
      //Dog dog=new Dog(); //this will automatically invoke Dog class constructor which inturn will invoke its super class(Animal) constructor
      //dog.displaycolor();
      //dog.eat();  //method overriding
      
      Cat cat=new Cat(); //this will automatically invoke Cat constr,Dog class constructor which inturn will invoke its super class(Animal) constructor
      cat.printcolor();
       cat.eat(); //invokes immediate super class(Dog) method in which its(Dog) own immediate super class(Animal) method is invokes
	}

}
