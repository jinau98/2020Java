
public class InterfaceMain {
	public static void main(String[] args) {
		
	
	Lendable[] lendList= {
			new SeperateVolume("789-95", "�ڹ�"),
			new AppCDInfo("��-4345", "CD1"),
			new SeperateVolume("234-45", "sql"),
			new AppCDInfo("��-2342", "CD2")
	};
	
	checkOutAll(lendList, "����", "2020-09-22");
	}
	
	public static void checkOutAll(Lendable[] lendList, String borrower, String date) {
		for (int i = 0; i < lendList.length; i++) {
			lendList[i].checkOut(borrower, date);
		}
	}
}
