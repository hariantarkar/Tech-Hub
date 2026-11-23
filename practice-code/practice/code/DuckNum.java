package practice.code;

public class DuckNum {
	public static void main(String x[]) {
		String num="123";
		/*
		 * boolean flag=false; while(num>0) { int rem=num%10; if(rem==0) { flag=true; }
		 * num=num/10; } if(flag) { System.out.print("number is duck:");
		 * 
		 * } else { System.out.print("number is not duck");
		 * 
		 * }
		 */
		
		boolean result=num.substring(1).contains("0");
	}
}

