
public class AccountMain {
	public static void main(String[] args) {
		Account acc1 = new Account("789-423-3423", "��ö��", 200000);
		Account acc2 = new Account("345-234-6364", "�ڿ���", 100000);
		
		int amount = acc1.withdraw(50000);
		acc2.deposit(amount);
		
		disp(acc1);
		disp(acc2);
	}
	public static void disp(Account acc) {
		System.out.println("�ڡڡڡڡڡڰ������� ��¡ڡڡڡڡڡ�");
		System.out.println("���¹�ȣ : " + acc.accountNo);
		System.out.println("������ : " + acc.ownerName);
		System.out.println("�ܾ� : " + acc.balance);
		System.out.println();
	}
}
