
public class ExceptionHandling_Checked 		//when complier shows error/warning untill we handle this won't run the prog
{

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started");
		System.out.println("Program is executing");
		
		/* try {
			Thread.sleep(5000);  //time in millisecond(used to pause the execution of statement for sometime as mentioned in bracket)
		} catch (InterruptedException e) // one way to handle is try-catch
		 {
			e.printStackTrace();			//optional
		}	*/
		
		    //Thread.sleep(5000);
		
		 System.out.println("Program is executed");
		 System.out.println("Program is in ended");
	}

}
