package practice.code;

public class FindMajorityElement {
	
	public static void main(String x[]) {
	
		int arr[]= {1,2,5,7};
		int majorityEle=-1;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int majority=arr[i];
			for(int j=0;j<arr.length;j++) {
				
				if(majority==arr[j]) {
					count++;
				}
				if(count >arr.length/2) {
					found=true;
					majorityEle=majority;
					break;
				}
			}
			
		}
		if(found) {
			System.out.print("found the majority element:"+majorityEle);
		}
		else {
			System.out.print("thier is not the majority element:");

		}
		
	}
}
