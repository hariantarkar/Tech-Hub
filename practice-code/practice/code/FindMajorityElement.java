package practice.code;

public class FindMajorityElement {
	
	public static void main(String x[]) {
	
		int arr[]= {1,2,3,3,3,3,4,3,5,3,6,3};
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			
			int majorityEle=arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) {
				
				if(majorityEle==arr[j]) {
				count++;	
				}
			}
		    if(count > arr.length/2) {
			System.out.print(" majority element is a :\t"+majorityEle);
		    found=true;
			break;
			}
		}
		if(!found) {
			System.out.print("thier is no majority element");
			
		}
	}
}
