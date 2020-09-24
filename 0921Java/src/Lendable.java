public interface Lendable {
	//상수
	public static final int STATE_NORMAL = 0;
	int STATE_BORROWED = 1; //(public static final이 자동으로 붙음)
	
	//반납
	public abstract void checkIn();
	
	//대출 (public abstract가 자동으로 붙음)
	void checkOut(String borrower, String date);
}