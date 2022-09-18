package learningArrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
//one way 
		int a[]=new int[5];	//declared array with size 5(index 0-4)====can't change the size once declared
		a[0]=100; 			//storing or inserting values into array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println("Length of Array is:" +a.length);	//prints length/size of an array
		System.out.println();
		System.out.println(a[2]);  								//prints specific value
		System.out.println();
		
		for(int i=0;i<a.length;i++) { 							//classic "for-loop"
			System.out.println(a[i]);
			 
		}
	//==================================================================================================
	//alternate way of creating, declaring and printing array
			
			int b[]={10,20,30,40,50,60,70,80,90,100};			//declaring array without specifying size
			
			System.out.println();
			for(int j:b) {										//Advance "for-loop"
				System.out.println(j);
			}
			
		}		
	
	

}
