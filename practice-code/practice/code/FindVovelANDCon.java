package practice.code;

public class FindVovelANDCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Harishchandra shahadeo antarkar";
		
		str=str.toLowerCase();
		int vowels=0;
		int constants=0;
		
		for(char ch:str.toCharArray()) {
			
			if(ch=='a' || ch=='e'||ch=='i'|| ch=='o' ||ch=='u') {
				vowels++;
			}
			else if(ch >='a' && ch <='z') {
				constants++;
			}
		}
		System.out.print("vowels count are:\t"+vowels);
		System.out.print("\nconstant count are:\t"+constants);
		
	}

}
