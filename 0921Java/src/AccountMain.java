
public class AccountMain {
	public static void main(String[] args) {
		Account acc1 = new Account("789-423-3423", "±èÃ¶¼ö", 200000);
		Account acc2 = new Account("345-234-6364", "¹Ú¿µÈñ", 100000);
		
		int amount = acc1.withdraw(50000);
		acc2.deposit(amount);
		
		disp(acc1);
		disp(acc2);
	}
	public static void disp(Account acc) {
		System.out.println("¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú°èÁÂÁ¤º¸ Ãâ·Â¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú");
		System.out.println("°èÁÂ¹øÈ£ : " + acc.accountNo);
		System.out.println("¿¹±İÁÖ : " + acc.ownerName);
		System.out.println("ÀÜ¾× : " + acc.balance);
		System.out.println();
	}
}
