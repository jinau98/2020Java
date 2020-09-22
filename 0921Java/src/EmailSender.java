
public class EmailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	
	EmailSender(String title, String senderName, String senderAddr, String emailBody){
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	@Override
	void sendMessage(String recipient) {
		System.out.println(">>>>>>>>>이메일 전송<<<<<<<<<<<<");
		System.out.println("제     목 : " + title);
		System.out.println("발 신 자 : " + senderName);
		System.out.println("수 신 자 : " + recipient);
		System.out.println("발신자주소 : " + senderAddr);
		System.out.println("내      용 : " + emailBody);
		System.out.println();
	}
}
