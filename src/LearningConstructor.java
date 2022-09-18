
public class LearningConstructor {
	int x;
	int y;
	
//Default Constructor
	LearningConstructor()
	{
		x=10;
		y=20;
		
	}
	
//Parameterized Constructor
	LearningConstructor(int a, int b){
		x=20;
		y=50;
	}
	
	 void display() {
		 
		 System.out.println(x+y);
		 
	 }

	public static void main(String[] args) {
		LearningConstructor con=new LearningConstructor();  //invokes default constructor
		con.display();
		LearningConstructor con1=new LearningConstructor(20,50);	//invokes parameterized constructor
		con1.display();
		
			}

}
