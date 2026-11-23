package practice.code;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			}
			if(count==2) {
				System.out.print("number is prime\t"+num);
				
			}else {
				System.out.print("nummber is not prime:\t"+num);
			}
		

	}

}
