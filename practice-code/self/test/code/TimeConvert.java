package self.test.code;

/**
 * timeInMinutes is a numeric value. Convert the numeric time in minutes to
 * string of format hours:minutes.
 * 
 * For example:
 * 
 * 126 minutes -> "2:6"
 * 60 minutes -> "1:0"
 * 35 minutes -> "0:35"
 */

public class TimeConvert {
	public String convert(int minutes) {
		
		int hours=minutes / 60;
		int minute=minutes % 60;
		
		return hours +":"+minute;
		
	}
	public static void main(String x[]) {
		
		TimeConvert tc=new TimeConvert();
		
		System.out.print(tc.convert(125));
		
	}
}
