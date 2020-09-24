
public class CreditLineAccount extends Account{
	int creditLine;
	
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine){
		super(accountNo, ownerName, balance);
		
		this.creditLine = creditLine;
	}
	
	int withdraw(int amount) {
		if((balance + creditLine)<amount) {
			System.out.println("인출할 수 없습니다.");
			return 0;
		}
		balance -= amount;
		return amount;
	}
}
