
public class AbstractMain {
	public static void main(String[] args) {
		EmailSender email1 = new EmailSender("�����Ϸ�", "12����", "master@12st.co.kr", "�ֹ��Ͻ� ��ǰ�� �����Ϸ�Ǿ����ϴ�.");
		SMSSender sms1 = new SMSSender("�����Ϸ�" , "12����", "02-1212-1212", "�ֹ��Ͻ� ��ǰ�� �����Ϸ�Ǿ����ϴ�.");
		EmailSender email2 = new EmailSender("��ۿϷ�", "12����", "master@12st.co.kr", "�ֹ��Ͻ� ��ǰ�� ��ۿϷ�Ǿ����ϴ�.");
		SMSSender sms2 = new SMSSender("��ۿϷ�", "12����", "02-1212-1212", "�ֹ��Ͻ� ��ǰ�� ��ۿϷ�Ǿ����ϴ�.");
		
		send(email1, "jjj@naver.com");
		send(sms1, "010-1234-2345");
		send(email2, "jjj@naver.com");
		send(sms2, "010-1234-2345");
	}
	
	public static void send(MessageSender ms, String recipient) {
		ms.sendMessage(recipient);
	}
}
