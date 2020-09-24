public class AbstractMain {
	public static void main(String[] args) {
		EmailSender email1 = new EmailSender("결제완료", "12번가", "master@12st.co.kr", "주문하신 상품이 결제완료되었습니다.");
		SMSSender sms1 = new SMSSender("결제완료" , "12번가", "02-1212-1212", "주문하신 상품이 결제완료되었습니다.");
		EmailSender email2 = new EmailSender("배송완료", "12번가", "master@12st.co.kr", "주문하신 상품이 배송완료되었습니다.");
		SMSSender sms2 = new SMSSender("배송완료", "12번가", "02-1212-1212", "주문하신 상품이 배송완료되었습니다.");
		
		send(email1, "jjj@naver.com");
		send(sms1, "010-1234-2345");
		send(email2, "jjj@naver.com");
		send(sms2, "010-1234-2345");
	}
	
	public static void send(MessageSender ms, String recipient) {
		ms.sendMessage(recipient);
	}
}