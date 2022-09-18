
public class LearningMethods {
	
	int x=10;
	int y=20;
	
//case 1- method not taking any parameters and not returning any value
	void sum() {
		System.out.println(x+y);
	}
	

//case 2- method not taking parameters but returning a value
		int sum1() {
		return (x+y);	
	}
		
//case 3- method taking parameter but not returning any value
			void sum2(int x, int y) {
				System.out.println(x+y);
			}
		
		
//case 4- method taking parameter and also returning value 
			int sum3(int x, int y) {
			return x+y;
			}
		
		
		
	public static void main(String[] args) {
		LearningMethods meth=new LearningMethods();
		
		meth.sum();
		
		//int ret=meth.sum1();  // ========0ne way
		//System.out.println(ret);
		System.out.println(meth.sum1());  // ========other way
		
		meth.sum2(100,200);
		
		System.out.println(meth.sum3(100,200)); 
	} 

}
