
public class Account {
	String accountNo;				//계좌번호
	String ownerName;				//예금주
	int balance;					//잔액
	
	//Account a = new Account("1234-1234-121-11", "홍길동", 10000)
	
	
	//생성자
	//(매개변수 세가지 받는 생성자를 생성했기 때문에 기본 생성자(Account a = new Account();)는 생성되지 않고 사용할 수 없음)
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance-= amount;
		return amount;
	}

}
