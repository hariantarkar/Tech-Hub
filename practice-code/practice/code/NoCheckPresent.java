package practice.code;

public class NoCheckPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		
		int num=9;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				flag=true;
			}
		} 
		String result=flag ? "no is a present":"num is not present";
		System.out.println(result);
	}

}
