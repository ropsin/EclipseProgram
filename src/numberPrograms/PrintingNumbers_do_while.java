package numberPrograms;

public class PrintingNumbers_do_while {

	public static void main(String[] args) {
		
		//Print 1-10
				System.out.println("\"Print Number 1-10\"");
				int n=1;
				do {
				System.out.print(n + " ");
				n++;
				}
				while(n<=10); 
			
		
		//Print 10-1
				System.out.println();
				System.out.println("\"Print Number 10-1\"");
				int a=10;
				do {
				System.out.print(a + " ");
				a--;
				}
				while(a>0);
		
		//Print even numbers
				System.out.println();
				System.out.println("\"Print Even Numbers\"");
				int m=2;
				do {
				System.out.print(m + " ");
				m+=2;
				}
				while(m<=10);
		
		//Print odd numbers
				System.out.println();
				System.out.println("\"Print Odd Numbers\"");
				int b=1;
				do {
				System.out.print(b + " ");
				b+=2;
				}
				while(b<=10);

	}

}
