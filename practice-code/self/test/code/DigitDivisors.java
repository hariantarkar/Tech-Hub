package self.test.code;
/*
Question:
Given a positive integer, count how many of its digits **evenly divide** the number itself.

A digit evenly divides a number if the number modulo digit equals 0.
Ignore any zero digits.

Examples:
Input: 1012 → Output: 3 (1, 1, 2 divide 1012)
Input: 1234 → Output: 2 (1 and 2 divide 1234)
Input: 111 → Output: 3 (all 1s divide 111)

Return:
- An integer representing the count of digits that divide the original number.

Input: 1012
Output: 3
*/
public class DigitDivisors {

	public int countter(int num) {
		
		int count=0;
		int temp=num;
		while(temp>0) {
			
			int digit=temp%10;
			if(digit!=0 && num % digit==0) {
				count++;
			}
			temp=temp/10;
		}
		return count;
	}
	public static void main(String x[]) {
		
		DigitDivisors dv=new DigitDivisors();
		
		System.out.print(dv.countter(1234));
	}
}
