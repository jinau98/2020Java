
public class InheritanceMain {
	public static void main(String[] args) {
		CheckingAccount check= new CheckingAccount("123-456-7890", "����", 200000, "9876-5432-1234");
		
		int money = check.withdraw(50000);
		System.out.println("����� �ݾ� : " + money);
		System.out.println("��           �� : " + check.balance);
		
		money = check.pay("9876-5432-1234", 150001);
		System.out.println("���� �ݾ� : " + money);
		System.out.println("��        �� : " + check.balance);
		
		CreditLineAccount credit = new CreditLineAccount("123-456-7890", "����", 200000, 200000);
		
		money = credit.withdraw(500000);
		System.out.println("������ �ݾ� : " + money);
		System.out.println("��           �� : " + credit.balance);
		
		BonusPointAccount bonus = new BonusPointAccount("123-456-6796", "����", 1000000, 10);
		
		bonus.deposit(500000);
		System.out.println("��     �� : " + bonus.balance);
		System.out.println("�� �� Ʈ : " + bonus.bonusPoint);
		
	}
}


