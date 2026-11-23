package self.test.code;
/*
Problem Statement:
You have a list of Transaction objects:
class Transaction {
    private String accountNumber;
    private double amount;
    private String type; // "DEBIT" or "CREDIT"
}

Write a method:
Map<String, Double> calculateNetBalances(List<Transaction> transactions)

This method should:
- Group the transactions by accountNumber.
- For each account, calculate the net balance as: sum of "CREDIT" amounts minus sum of "DEBIT" amounts.
- Return a Map<String, Double> representing: accountNumber → net balance.

Constraints & Notes:
- The input list may contain transactions in any order.
- An account may have only "CREDIT" or only "DEBIT" transactions.
- If there are no "DEBIT" transactions for an account, treat it as 0.
- Use Java 8 Streams if possible.

@author Lalit Patil
 */

public class Transaction {
	
	private String AccountNumber;
	private double amount;
	private String type;
	
	Transaction(String AccountNumber,double amount,String type){
		this.AccountNumber=AccountNumber;
		this.amount=amount;
		this.type=type;
	}
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	public  Double getAmount() {
		return amount;
	}
	public String getType() {
		return type;
	}
	
	
}




