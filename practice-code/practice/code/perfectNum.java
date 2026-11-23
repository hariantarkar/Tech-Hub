package practice.code;

public class perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=6,sum=0;
		
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.print("number is perfect:\t"+num);
		}
		else {
			System.out.print("number is not perfect:\t"+num);
			
		}
	}

}
