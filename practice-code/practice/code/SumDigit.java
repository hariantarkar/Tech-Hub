package practice.code;

public class SumDigit {

	public static void main(String[] args) {
		int digit=1234;
		int sum=0;
		
		while(digit >0) {
			int rem=digit%10;
			sum=sum+rem;
			digit=digit/10;
		}
		System.out.print("sum of digit:\t"+sum);
	}

}
