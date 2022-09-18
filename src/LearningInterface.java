
 interface I{
	int a=50;  					//by default variables of interface is static or final
	 void method();				//interface has abstract method by default
}

 

public class LearningInterface implements I {
			
	public void method() {  		//the method should have stronger access specifier than the abstract method in interface
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		
		//LearningInterface l=new LearningInterface(); //we can create an object for class and can be used with interface variable
		//l.method();
		
		I i=new LearningInterface();	// we can create reference variable for an interface but instantiation is not possible
		i.method();						
		
	}

}
