package practice.code;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="listen";
		String str1="silent";
		
		if(str.length()!=str1.length()) {
			System.out.print("not anagram");
			return;
		}
		char a[]=str.toCharArray();
		char b[]=str1.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("not Anagram");
			
		}
	}

}


