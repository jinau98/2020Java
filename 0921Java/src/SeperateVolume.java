
public class SeperateVolume implements Lendable {

	String requestNo;

	String bookTitle;

	String writer;

	String borrower;

	String date;

	int state;

	SeperateVolume(String borrower, String date) {

		this.borrower = borrower;

		this.date = date;

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

			System.out.println(" -------- ���ົ ���� ---------");

			System.out.println("#" + bookTitle + " ���ົ�� ����Ǿ����ϴ�.");

		} else {

			System.out.println("#" + bookTitle + " ���ົ�� ���� �Ұ��մϴ�.");

		}

		System.out.println();

	}

}