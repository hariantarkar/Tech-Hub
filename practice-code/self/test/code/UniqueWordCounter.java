package self.test.code;

/*
Problem Statement:
Given a list of sentences (List<String>), write a method:
int countUniqueWords(List<String> sentences)

This method should:
- Extract all words from the sentences.
- Ignore case ("Hello" and "hello" are the same word).
- Count the number of unique words across all sentences.

Constraints & Notes:
- Words are separated by spaces.
- No need to handle punctuation (e.g., "Hello, world!") for this question.
- Use Java Streams to implement the solution.
*/
import java.util.*;
import java.util.Map.Entry;
public class UniqueWordCounter {
	
	public int UniqueWordCounter(List<String>Sentences) {
	
		Set<String>set=new HashSet<>();
		
		for(String sen:Sentences) {
			
			for(String word:sen.split(" ")) {
				set.add(word.toLowerCase());
			}
		}
		
		return set.size();
	}
	public static void main(String x[]) {
		
		UniqueWordCounter un=new UniqueWordCounter();
		
		List<String>data=Arrays.asList("Hello ram","hello sham");
		
		System.out.print(un.UniqueWordCounter(data));
		
	}
}
