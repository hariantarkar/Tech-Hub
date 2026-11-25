package practice.code;
import java.util.*;
import java.util.Map.Entry;
public class FreSpecificEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str="Hari harsh";
		
		Map<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		
		for(char c:str.toLowerCase().toCharArray()) {
			
			if(c!=' ') {
				map.merge(c,1,Integer::sum);
			}
		}
			System.out.print("enter char which you want get the frq:");
			char ch= sc.next().charAt(0);
			int count=0;
			for(Map.Entry<Character,Integer>entry:map.entrySet()) {
				
				if(entry.getKey()==ch) {
					 count=entry.getValue();
				}
				
			}
			System.out.print(ch +" freq of the char count:\t"+ count );
}
}



	


