public class AccountMain {
	public static void main(String[] args) {
		Account acc1 = new Account("789-423-3423", "김철수", 200000);
		Account acc2 = new Account("345-234-6364", "박영희", 100000);
		
		int amount = acc1.withdraw(50000);
		acc2.deposit(amount);
		
		disp(acc1);
		disp(acc2);
	}
	public static void disp(Account acc) {
		System.out.println("★★★★★★계좌정보 출력★★★★★★");
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주 : " + acc.ownerName);
		System.out.println("잔액 : " + acc.balance);
		System.out.println();
	}
}