package HTA0416.Review7;

///*MessageNotification1 */
public class MessageNotification1 {
	
	private KakaoTalkMessageSender katalkSender = new KakaoTalkMessageSender();
	private EmailMessageSender emailSender = new EmailMessageSender();
	private SmsMessageSender smsSender = new SmsMessageSender();

	
	////notice(customer,from,title,content) 메소드 (if-else if문)
	public void notice(Customer customer, String from, String title, String contect) {
		
		String[] messageType = customer.getAgreeNotificaitonTypes();
		for(String item :messageType) {
			if(item.equals("katalk")) {
				katalkSender.sendMessage(from, customer.getName(), title, contect);
				
			}else if(item.equals("email")) {
				emailSender.sendMessage(from, customer.getName(), title, contect);
				
			}else if(item.equals("sms")) {
				smsSender.sendMessage(from, customer.getName(), title, contect);
			}
		}
	}
}
