package numberPrograms;

public class PrintingNumbers_while {

	public static void main(String[] args) {
		//Print 1-10
				System.out.println("\"Print Number 1-10\"");
				
				int n=1;
				while(n<=10) {
					System.out.print(n + " ");
					n++;
				}
				//Print 10-1
						System.out.println();
						System.out.println("\"Print Number 10-1\"");
						
						int a=10;
						while(a>0) {
							System.out.print(a + " ");
							a--;
						}
				
				System.out.println();
				System.out.println("\"Print Even Numbers\"");
			
				int m=2;
				while(m<=10) {
					
			
					System.out.print(m + " ");
					m+=2;							//m=m+2;
					}
				
				System.out.println();
				System.out.println("\"Print Odd Numbers\"");
			
				int o=1;
				while(o<=10) {
					
			
					System.out.print(o + " ");
					o+=2;							//o=o+2;
					}
	}

}
