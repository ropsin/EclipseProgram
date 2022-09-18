
public class Exceptions {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		//int a=100;
		//System.out.println(a/0);					//throws ArithmaticException
		
		//String s=null;
		//System.out.println(s.length());				//throws NullPointerException when we apply any string method
		
		String str="123";
		int x=Integer.parseInt(str);					//way to convert numeric string datatype value into integer datatype value		
		System.out.println(x); 
		
		/*String st="abc";
		int y=Integer.parseInt(st);						//throws NumberFormatException 
		System.out.println(y); */
		
		
		int i[]=new int[5];								//throws ArrayIndexOutOfBoundsException
		i[10]=50;
		
		System.out.println("Program is executed");
		System.out.println("Program is in ended");

	}

}
