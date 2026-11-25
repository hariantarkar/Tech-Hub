package practice.code;

public class MoveZeroEndArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,0,4,0,6,0,8};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			
		}
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			arr[index++]=arr[i];
			}
			
		}
		while(index < arr.length) {
			arr[index++]=0;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print("\t"+arr[i]);
			
		}
	}

}
