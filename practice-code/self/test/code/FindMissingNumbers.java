package self.test.code;

import java.util.*;

/**

Write a program to find the missing numbers in the sequence.
    - Input will be an array of integers, treat them as a sequence.
    - The numbers in the input array may or may not be sorted.
    - Find the missing number so that the given sequence can be completed.
    - Output must also be an array of integers containing the missing numbers.
    - Output array must be in the sorted order.
    - If nothing is missing in the input sequence, the output array should be empty.

Example	

Input: [4, 2, 1, 6]
Output: [3, 5]

*/

public class FindMissingNumbers {
	public List<Integer>execute(List<Integer>list){
		
		if(list==null || list.isEmpty()) {
			return new ArrayList<Integer>();
		}
		
		Integer min=Collections.min(list);
		Integer max=Collections.max(list);
		
		Set<Integer>missing=new LinkedHashSet<Integer>();
		
		Set<Integer>set=new HashSet<Integer>(list);
		
		for(int i=min;i<=max;i++) {
			
			if(!set.contains(i)) {
				missing.add(i);
			}
			
			
		}
		
		return new ArrayList<Integer>(missing);
		
	}
	public static void main(String x[]) {
		
		FindMissingNumbers fm=new FindMissingNumbers();
		
		List<Integer>list=Arrays.asList(1,3,5,7,9);
		
		System.out.print(fm.execute(list));
		
	}
}