package self.test.code;
import java.util.*;
public class CalculateNetBalanceInAccount {
	
	public Map<String,Double>calculateNetBalance(List<Transaction>Transactions){
		
		Map<String,Double>result=new HashMap<>();
		for(Transaction t:Transactions) {
			double value="Credit".equalsIgnoreCase(t.getType())? t.getAmount():-t.getAmount();
		result.merge(t.getAccountNumber(), value,Double::sum);
		}
		return result;
	}
	
	public static void main(String x[]) {
		
		CalculateNetBalanceInAccount CNB= new CalculateNetBalanceInAccount();
		
		List<Transaction>transaction=Arrays.asList(new Transaction("mno123", 100, "credit"));
	
	Map<String,Double>result=CNB.calculateNetBalance(transaction);
	System.out.println(result);
	
	}
}




