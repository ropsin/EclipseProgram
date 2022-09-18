package numberPrograms;

public class Assignment1 {

	public static void main(String[] args) {
		
		
//Printing if  number is positive/negative
			int i=2;
			if(i<0)
				System.out.println(i+" is a negative number");
			else
				System.out.println(i+" is a positive number");
			i--;

//------------------------------------------------------------------------------------------------------			
//Printing greatest of 3 numbers
			int a=30;
			int b=80;
			int c=70;
			if (a>b && b>c) {
				System.out.println(a+ "is the greatest among the three numbers.");
			}
			else if(a<b && b<c) {
				System.out.println(c +" is the greatest among the three numbers.");
			}
			else {
				System.out.println(b+ " is the greatest among the three numbers.");
			}
					
//-------------------------------------------------------------------------------------------------------			
//Swapping the value of two variables
//first way				
			int m=40;
			int n=50;
			int s=m; 
			m=n;
			n=s;
			
			System.out.println(m);
			System.out.println(n);
			
//alternative way			
			int x=10;
			int y=90;
			int z=x+y; 
			y=z-y;		
			x=z-y;

			System.out.println(x);
			System.out.println(y);
			
//------------------------------------------------------------------------------------------------------			
//Printing table
//one way			
			System.out.print("Table of 5:"+ " ");
			System.out.print("[");
			
			for(int d=1; d<=10;d++)
			{
			int prod=d*5;
				
			System.out.print( prod+ " " );							
			}
			System.out.print("]");
			
			
	
//other way
			
			System.out.println();
			System.out.print("Table of 5:"+ " ");
			System.out.println();
			for(int f=1; f<=10;f++) 
			{
			int prod= 5*f;
			System.out.println("5*" +f +"=" + prod);
			}
			
//------------------------------------------------------------------------------------------------------			
//Printing length/count of digits of a number
			
			
			
			
			
			
			
	}

}
