
public class Polymorphism {
	public static void main(String[] args) {
	Account acc = new Account("123-456-789", "����", 200000);
	CheckingAccount check = new CheckingAccount("123-345-456", "����", 100000, "1234-2345-3456");
	CreditLineAccount minus = new CreditLineAccount("135-246-357", "����", 500000, 1000000);
	BonusPointAccount bonus = new BonusPointAccount("124-352-123", "���", 700000, 1500);

	disp(acc);
	disp(check);
	disp(minus);
	disp(bonus);
	
	}


public static void disp(Account acc) {
	System.out.println(">>>>>>>>>>���� ���� ���<<<<<<<<<<<<");
	System.out.println("���¹�ȣ : " + acc.accountNo);
	System.out.println("�� �� ��  : " + acc.ownerName);
	System.out.println("��      �� : " + acc.balance);
	
	if(acc instanceof BonusPointAccount) {
		BonusPointAccount bonus = (BonusPointAccount) acc;
		System.out.println("�� �� Ʈ : " + bonus.bonusPoint);
	}else if(acc instanceof CheckingAccount) {
		CheckingAccount checkingAccount = (CheckingAccount) acc;
		checkingAccount.pay("1234-2345-3456", 1000000);
	}
	System.out.println();
}
}