
public class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;
	
	SMSSender(String title, String senderName, String returnPhoneNo, String message){
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	
	@Override
	void sendMessage(String recipient) {
		System.out.println(">>>>>>>문자 메시지 전송<<<<<<<<");
		System.out.println("제     목 : " + title);
		System.out.println("발 신 자 : " + senderName);
		System.out.println("수 신 자 : " + recipient);
		System.out.println("회신전화 : " + returnPhoneNo);
		System.out.println("내     용 : " + message);
		System.out.println();
	}
}
