
public class CheckingAccount extends Account{
	String cardNo;
	
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		super(accountNo, ownerName, balance);
		
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) {
		if(!cardNo.equals(this.cardNo) || (balance<amount)){
			System.out.println("지불이 불가능합니다.");
			return 0;
		}
		return withdraw(amount);
	}
}
