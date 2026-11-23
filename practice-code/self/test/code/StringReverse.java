package self.test.code;

/*

Question: Reverse the characters of the following string and return the same back to the invoking class.

text="skcor avaj"
*/
public class StringReverse {

	public String execute(String data) {
		
		//StringBuilder sb=new StringBuilder(data).reverse();
		//sb.reverse();
		//return sb.toString();
		String rev="";
	
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=data.length()-1;i>=0;i--) {
			sb.append(data.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String x[]) {
		
		StringReverse st=new StringReverse();
		
		String data="irah ba";
		
		System.out.println("input data before reverse:\t "+data);
		
		System.out.println("input data after reverse:\t"+st.execute(data));
		
	}

}
