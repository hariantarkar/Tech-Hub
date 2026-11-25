package practice.code;
import java.util.*;
public class FreEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hari hari harsh";
		
		Map<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		
		for(char c:str.toLowerCase().toCharArray()) {
			if(c!=' ')
			map.merge(c,1,Integer::sum);
		}
		
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			
			System.out.println(entry.getKey()+"\t character freq count: "+entry.getValue());
			
		}
	}

	
}
