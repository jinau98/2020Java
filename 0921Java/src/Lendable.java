public interface Lendable {
	//���
	public static final int STATE_NORMAL = 0;
	int STATE_BORROWED = 1; //(public static final�� �ڵ����� ����)
	
	//�ݳ��ϴ�.
	public abstract void checkIn();
	
	//�����ϴ� (public abstract�� �ڵ����� ����)
	void checkOut(String borrower, String date);
}