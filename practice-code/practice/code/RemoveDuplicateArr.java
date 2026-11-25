package practice.code;
import java.util.*;
public class RemoveDuplicateArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[]= {1,2,3,2,4,5};
		
		Set<Integer>set=new LinkedHashSet<Integer>(Arrays.asList(a));
		
		System.out.print(set);
	}

}
