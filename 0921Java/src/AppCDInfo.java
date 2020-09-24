public class AppCDInfo extends CDInfo implements Lendable {

	String borrower;
	String date;
	int state;

	public AppCDInfo(String registNo, String title) {
		super(registNo, title);
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.date = null;
		this.state = STATE_NORMAL;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (this.state == STATE_NORMAL) {
			this.borrower = borrower;
			this.date = date;
			this.state = STATE_BORROWED;

			System.out.println(" -------- 부록 CD 대출 ---------");
			System.out.println("#" + title + " CD가 대출되었습니다.");
		} else {
			System.out.println("#" + title + " CD는 대출 불가합니다.");
		}
		System.out.println();
	}

}