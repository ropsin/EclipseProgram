
public class StringVowel {
	
	

	public static void main(String[] args) {
		String s="Java Developer";
		String s1="";
		 
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		
				s1=s1+" "+c;
		}
		System.out.println("Vowels present in the given string are:"+ s1);
	}

}
