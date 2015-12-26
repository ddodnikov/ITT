package homework_6;
public class CallsDemo {

	public static void main(String[] args) {
		
		GSM gsm1 = new GSM();
		GSM gsm2 = new GSM();
		
		gsm1.model = "NOKIA";
		gsm1.hasSimCard = true;
		gsm1.simMobileNumber = "0882482402";
		gsm1.outgoingCallsDuration = 23.35;

		gsm2.model = "SAMSUNG";
		gsm2.hasSimCard = true;
		gsm2.simMobileNumber = "0882578126";
		gsm2.outgoingCallsDuration = 12.44;

		gsm2.removeSimCard();
		gsm2.insertSimCard("0886976452");
		
		gsm1.call(gsm2, 2.33);
		
		double sum = gsm1.getSumForCall();
		System.out.println(sum);
		
		gsm1.printInfoForTheLastOutgoingCall();
		gsm2.printInfoForTheLastIncomingCall();

	}

}
