
	class A1{
	void m1() {
  System.out.println("This is method m1 is from class A1");
	}
  
}	
	interface B1 {
		void m2();
	}

	interface B2 {
		void m3();
	}




public class HybridInherritance_UsingInterface extends A1 implements B1,B2 {
		
		public void m2() {
			System.out.println("This method m2 is from Interface B1");
			
	}
		public void m3() {
			System.out.println("This method m3 is from Interface B2");
			
	}
  
 
	public static void main(String[] args) {
		
		System.out.println("This is an example of Hybrid Interface");
		HybridInherritance_UsingInterface hyb=new HybridInherritance_UsingInterface();
		hyb.m1();
		hyb.m2();
		hyb.m3();
		System.out.println("I am a child class which has inherrited methods from parent class A1 and parent Interfaces B1 & B2");
		
	}

}
