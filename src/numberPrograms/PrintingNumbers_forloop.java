package numberPrograms;

public class PrintingNumbers_forloop {

	public static void main(String[] args) {
		
		//Print 1-10
				System.out.println("\"Print Number 1-10\"");
				for(int a=1;a<=10;a++) {
				System.out.print(a + " ");
				}
		
		
		//Print 10-1
				System.out.println();
				System.out.println("\"Print Number 10-1\"");
				for(int a=10;a>0;a--) {
				System.out.print(a + " ");
				}
				

		//Print even numbers
				System.out.println();
				System.out.println("\"Print Even Numbers\"");
				for(int a=2;a<=10;a+=2) {
				System.out.print(a + " ");
				}
				
				
		//Print odd numbers
				System.out.println();
				System.out.println("\"Print Odd Numbers\"");
				for(int a=1;a<=10;a+=2) {
				System.out.print(a + " ");
				}		
				
	}
}
