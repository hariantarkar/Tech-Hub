package practice.code;
import java.util.*;
public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcabcded";
		
		Map<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		
		for(char c:str.toCharArray()) {
			//map.merge(c, 1, Integer::sum);
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.print(entry.getKey());
				
			}
		}
	}

}

