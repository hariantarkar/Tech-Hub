package self.test.code;
/*
Question: As part of Metamorphosys's data input we get a lot of unstructed data and need to extract values from the data.

From the following test please extract out the email 'thanos@titan.com' and return it as a string.

text="Hi, I am unable to get this gauntlet off my hand. I used it to snap my fingers however now its stuck and extremely itchy. Please email me at thanos@titan.com as soon as possible, - Thanos"
*/

public class RegexExtract {
	

	public String execute(String data) {
		
		for(String word:data.split(" ")) {
			if(word.contains("@")) {
				return word;
			}
		}
		return null;
		
	}
	public static void main(String x[]) {
		RegexExtract rg=new RegexExtract();
		
		String data="hari antarkar and hari and hariantarkar@gmail.com";
		
		System.out.println(rg.execute(data));
		
	}
}
