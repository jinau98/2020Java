
public class Polymorphism {
	public static void main(String[] args) {
	Account acc = new Account("123-456-789", "김밥풀", 200000);
	CheckingAccount check = new CheckingAccount("123-345-456", "최꾸마", 100000, "1234-2345-3456");
	CreditLineAccount minus = new CreditLineAccount("135-246-357", "김밥톨", 500000, 1000000);
	BonusPointAccount bonus = new BonusPointAccount("124-352-123", "부끄", 700000, 1500);

	disp(acc);
	disp(check);
	disp(minus);
	disp(bonus);
	
	}


public static void disp(Account acc) {
	System.out.println(">>>>>>>>>>계좌정보<<<<<<<<<<<<");
	System.out.println("계좌번호: " + acc.accountNo);
	System.out.println("예금주: " + acc.ownerName);
	System.out.println("잔  액: " + acc.balance);
	
	if(acc instanceof BonusPointAccount) {
		BonusPointAccount bonus = (BonusPointAccount) acc;
		System.out.println("포 인 트 Ʈ : " + bonus.bonusPoint);
	}else if(acc instanceof CheckingAccount) {
		CheckingAccount checkingAccount = (CheckingAccount) acc;
		checkingAccount.pay("1234-2345-3456", 1000000);
	}
	System.out.println();
}
}