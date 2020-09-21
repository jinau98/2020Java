
public class InheritanceMain {
	public static void main(String[] args) {
		CheckingAccount check= new CheckingAccount("123-456-7890", "정정", 200000, "9876-5432-1234");
		
		int money = check.withdraw(50000);
		System.out.println("인출된 금액 : " + money);
		System.out.println("잔           액 : " + check.balance);
		
		money = check.pay("9876-5432-1234", 150001);
		System.out.println("지불 금액 : " + money);
		System.out.println("잔        액 : " + check.balance);
		
		CreditLineAccount credit = new CreditLineAccount("123-456-7890", "진진", 200000, 200000);
		
		money = credit.withdraw(500000);
		System.out.println("인출할 금액 : " + money);
		System.out.println("잔           액 : " + credit.balance);
		
		BonusPointAccount bonus = new BonusPointAccount("123-456-6796", "유유", 1000000, 10);
		
		bonus.deposit(500000);
		System.out.println("잔     액 : " + bonus.balance);
		System.out.println("포 인 트 : " + bonus.bonusPoint);
		
	}
}


