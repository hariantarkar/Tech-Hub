package self.test.code;

import java.util.*;;

/*
Question: subtract list2 from list1. result should be list data type with unique subtracted elements.
return result from execute method

list1 = [1, 2, 3, 4, 5, 6]
list2 = [2, 3]

result should be [1, 4, 5, 6]
*/

public class SubtractList {

	public List<Integer>execute(List<Integer>list1,List<Integer>list2){
		if(list1==null || list1.isEmpty()) {
			return new ArrayList<Integer>();
		}
		if(list2==null || list2.isEmpty()) {
			return  new ArrayList<>(new LinkedHashSet<>(list1));
		}
		
		Set<Integer>set=new HashSet<Integer>(list2);
		Set<Integer>result=new LinkedHashSet<Integer>();
		
		for(int num:list1) {
			
			if(!set.contains(num)) {
				result.add(num);
			}
		}
		
		return new ArrayList<Integer>(result);
	}
	public static void main(String x[]) {
		
		SubtractList sb=new SubtractList();
		
		List<Integer>list1=Arrays.asList(1,2,3,4,5,6,7);
		List<Integer>list2=Arrays.asList(2,4);
		
		System.out.print(sb.execute(list1, list2));
		
	}
}
