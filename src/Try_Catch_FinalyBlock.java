 
public class Try_Catch_FinalyBlock {

	public static void main(String[] args) {
		System.out.println("Program is started");
		
		int a=100;
		
		try {
			
			//System.out.println(a/5); 			 						//case 1 - Exception doesn't occur
			System.out.println(a/0);								 	//case 2 - Exception occurred and handled
		}
		/*catch(ArithmeticException ae) {
			System.out.println("Entered into a catch block");*/
			
			catch(NumberFormatException nf) {							//case 3 - Exception occurred but not handled
				System.out.println("Entered into a catch block");
				
		}
		finally{														//in all the above 3 cases finally block will always execute
			System.out.println("Entered into a finally block");
		}
		

		System.out.println("Program is exited");						//in case 3 finally block executes but this statement doesn't because excpt is not handled
																		//it will execute only in case 1 & 2
	}

}
