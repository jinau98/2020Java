
public class Account {
	String accountNo;				//���¹�ȣ
	String ownerName;				//������
	int balance;					//�ܾ�
	
	//Account a = new Account("1234-1234-121-11", "ȫ�浿", 10000)
	
	
	//������
	//(�Ű����� ������ �޴� �����ڸ� �����߱� ������ �⺻ ������(Account a = new Account();)�� �������� �ʰ� ����� �� ����)
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
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		balance-= amount;
		return amount;
	}

}
