package practice.code;

public class Palindrome {
	public static void main(String x[]) {
		String str="madam";
		
		StringBuilder sb=new StringBuilder(str).reverse();
		
		if(str.equals(sb.toString())) {
			System.out.println("string are palindrome");
		}else {
			System.out.println("string are not palindrome");
		}
	}
	
}





