
public class ExceptionHandling_Unchecked {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is executing");
		
		int a=100;
		String s=null;
		String st="abc";
		int i[]=new int[5];		
		
		try   									//executes all the unchecked excpts
		{
		//System.out.println(a/0);				//will enter in 1st catch block n terminates won't go to second line of code
		//System.out.println(s.length());		//will enter in 2nd catch block skipping other unrelated catch block n terminates
		//int y=Integer.parseInt(st);				//will enter 3rd block according to its excpt
		i[10]=50;									//will enter the 4th catch block
		
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Entered into Catch block1");
		}
	
		catch(NullPointerException np)
		{
			System.out.println("Entered into Catch block2");
		}
		catch(NumberFormatException nf )
		{
			System.out.println("Entered into Catch block3");
		}
		catch(ArrayIndexOutOfBoundsException ar )
		{
			System.out.println("Entered into Catch block4");
		}
			System.out.println("Program is executed");
			System.out.println("Program is ended");

	}

}
