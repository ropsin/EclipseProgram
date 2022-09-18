
public class Demo {
	
	String name;
	int age;

	void display()
	{
	System.out.println(name +" " + age);
	//System.out.println(age);
	}
	
	public static void main(String[] args) {
	Demo d1=new Demo();
	d1.name="Roopam";
	d1.age=30;
	d1.display();
	  
	//Demo d2=new Demo(); ===no need to create diff obj, we can create one object n pass differnt values
	d1.name="Dipti";
	d1.age=25;
	d1.display();
	 
	}
	
}
