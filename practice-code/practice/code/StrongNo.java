package practice.code;

public class StrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=145;
		int temp=num,sum=0;
		while(num > 0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			
		}
		if(temp==sum) {
				System.out.print("number is a strong :\t"+temp);
		}
		else {
			System.out.print("num is not strong :\t"+temp);
			
		}
	}

}
