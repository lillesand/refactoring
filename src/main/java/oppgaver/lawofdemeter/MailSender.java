package oppgaver.lawofdemeter;

public class MailSender {

	public void ackToGmailSender(Message msg) {
		if(msg.getSender().getAddress().split("@",1)[1].compareTo("gmail.com") == 0) {
			sendMail(msg.getSender().getAddress(), "Got it");
		}
	}

	private void sendMail(String address, String message) {
		//omitted
	}
	
}
