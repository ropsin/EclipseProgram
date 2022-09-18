package learningArrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];  //declared array with size 5(index 0-4)====can't change the size once declared
		
		a[0][0]=10;				//storing or inserting values into array	
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		
	System.out.println("Number of Rows:" +a.length); 		//displays size of rows
	System.out.println("Number of Columns:" +a[0].length);		//displays size of columns
	
			
	for(int i=0;i<a.length;i++) 						//classic for loop
		{												//outer loop
		for(int j=0; j<a[i].length; j++) {				//inner loop
			
			System.out.println(a[i][j]);
			
		}	
		}
		System.out.println();
		//---------------------------------------------------------------------------------------------------
		
		
		int b[][]= { {100,200}, {300,400}, {500,600} };//declaring array without declaring size(size can change size anytime)
		
		for(int r[]:b) {								//adv for loop for rows
		for(int j:r){									//adv for loop for columns
			System.out.println(j);
		}
		}
	
	}

}
