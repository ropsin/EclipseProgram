

	 interface A{
			int a=50;  					
			 void method();				
			 }

		 interface B{
				int b=20;  					
				 void method();				
			}
		 
		 interface C{
				int c=10;  					
				 void method();				
		 	}

		public class MultipleInherritance_UsingInterface implements A, B, C {
					
			public void method() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			

			public static void main(String[] args) {
				
				//LearningInterface l=new LearningInterface(); //we can create an object for class and can be used with interface variable
				//l.method();
				
				A a=new MultipleInherritance_UsingInterface();	// we can create reference variable for an interface but instantiation is not possible
				a.method();						
				
			}
		}
		
