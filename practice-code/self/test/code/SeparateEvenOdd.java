package self.test.code;
import java.util.*;
import java.util.Map;

/**
 
Write a program to seprate Even and Odd numbers.
    - Input will be an integer number.
    - Output must be a map containing 2 lists of even digits and odd digits.
    - Order of the digits given in the input must be same.
    - Ignore anything other than numers from the input.

Example	

Input: 482913
Output: [4, 8, 2], [9, 1, 3]

*/

public class SeparateEvenOdd {
	public static final String Even="even";
	public static final String ODD="odd";
	
	public Map<String,List<Integer>>execute(int input){
		
		
		List<Integer>even=new ArrayList<>();
		List<Integer>odd=new ArrayList<>();
		
		String str=String.valueOf(input);
		
		for(char c:str.toCharArray()) {
			
			int digit=c -'0';
			if(digit %2==0 ) {
				
				even.add(digit);
			}else {
				odd.add(digit);
			}
			
		}
		
		
		Map<String,List<Integer>>result=new HashMap<>();
		
		result.put(SeparateEvenOdd.Even, even);
		result.put(SeparateEvenOdd.ODD, odd);
		
		
		
		
		return result;
		
	}
	public static void main(String x[]) {
		
		SeparateEvenOdd sp=new SeparateEvenOdd();
		
		System.out.println(sp.execute(12345678));
		
	}
}
