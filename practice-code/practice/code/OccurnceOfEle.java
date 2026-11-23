package practice.code;

public class OccurnceOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,3,3,4,6};
		
		int num=3;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==num) {
				count++;
			}
			
		}
		System.out.println("num occurance are  is "+count);

	}

	
}


