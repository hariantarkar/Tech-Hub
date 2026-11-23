package self.test.code;
import java.util.*;

/*
 Question: Given a string, find the first non-repeating character in it and return that character.
 If all characters repeat, return "_".

 Examples:
 "metamorphosys" → "e" (because 'm' repeats, but 'a' does not)
 "swiss" → "w"
 "aabbcc" → "_"

 Return:
 - First non-repeating character as a string (e.g., "u", "w")
 - Or "_" if none found

 Input: "success"
 Output: "u"
*/ 

public class FirstUniqueCharacter {

	public String execute(String data) {
		
		if(data==null ||data.isEmpty()) {
			return "_";
			
		}
		Map<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		for(char word:data.toCharArray()) {
			
			map.merge(word, 1, Integer::sum);
		}
		
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()==1) {
				return String.valueOf(entry.getKey());
			}
		}
	
	return "_";
	}
	
	public static void main(String x[]) {
		
		FirstUniqueCharacter fm=new FirstUniqueCharacter();
		
		System.out.print(fm.execute("success"));
	}
}


