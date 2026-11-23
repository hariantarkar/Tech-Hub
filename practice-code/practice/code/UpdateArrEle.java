package practice.code;
import java.util.*;
public class UpdateArrEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,7};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("\n enter num which you want update and new num also ");
		int updatenum=sc.nextInt();
		int newValue=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==updatenum) {
				arr[i]=newValue;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	

}
