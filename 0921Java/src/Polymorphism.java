
public class Polymorphism {
	public static void main(String[] args) {
	Account acc = new Account("123-456-789", "하이", 200000);
	CheckingAccount check = new CheckingAccount("123-345-456", "하이", 100000, "1234-2345-3456");
	CreditLineAccount minus = new CreditLineAccount("135-246-357", "바이", 500000, 1000000);
	BonusPointAccount bonus = new BonusPointAccount("124-352-123", "고고", 700000, 1500);

	disp(acc);
	disp(check);
	disp(minus);
	disp(bonus);
	
	}


public static void disp(Account acc) {
	System.out.println(">>>>>>>>>>계좌 정보 출력<<<<<<<<<<<<");
	System.out.println("계좌번호 : " + acc.accountNo);
	System.out.println("예 금 주  : " + acc.ownerName);
	System.out.println("잔      액 : " + acc.balance);
	
	if(acc instanceof BonusPointAccount) {
		BonusPointAccount bonus = (BonusPointAccount) acc;
		System.out.println("포 인 트 : " + bonus.bonusPoint);
	}else if(acc instanceof CheckingAccount) {
		CheckingAccount checkingAccount = (CheckingAccount) acc;
		checkingAccount.pay("1234-2345-3456", 1000000);
	}
	System.out.println();
}
}