package practice.code;

public class RevNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=1234,rev=0;
	
	while(num>0) {
		int rem=num%10;
		num=num/10;
		rev=rev*10+rem;
		
	}
	System.out.print("number after reverse:\t"+rev);
	}

}
