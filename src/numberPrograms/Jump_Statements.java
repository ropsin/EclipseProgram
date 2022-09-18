package numberPrograms;

public class Jump_Statements {

	public static void main(String[] args) {
		
		
	//Use of break command ========= will not print 5 n beyond
			for(int i=1;i<=10;i++)
			{
				if(i==7)
				{
					break;
				}
				System.out.print(i+ " ");
			}
			System.out.println();
		
		
			
	//Use of continue command ========= will skip the specified condition n continue after that		
			for(int i=1;i<=10;i++)
			{
			if(i==5 || i==6 || i==7)
			{
			continue;
			}
			
			System.out.print(i+ " ");
			}
	}

}
