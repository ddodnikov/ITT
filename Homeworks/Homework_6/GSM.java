package homework_6;
public class GSM {
	
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	void insertSimCard(String simMobileNumber) {
		if(simMobileNumber != null) {
			if(simMobileNumber.startsWith("08") && simMobileNumber.length() == 10) {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			}
		}
	}
	
	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = null;
	}
	
	void call(GSM receiver, double duration) {
		if(receiver != null && duration > 0 && this.hasSimCard == true &&
			receiver.hasSimCard == true && this != receiver) {

			Call newCall = new Call();
			newCall.duration = duration;
			newCall.receiver = receiver;
			newCall.caller = this;
			
			this.lastOutgoingCall = newCall;
			receiver.lastIncomingCall = newCall;
			this.outgoingCallsDuration += duration;
		}
	}
	
	double getSumForCall() {
		if(this.outgoingCallsDuration <= 0){
			return 0.0;
		} else {
			return this.outgoingCallsDuration * Call.priceForAMinute;
		}
	}
	
	void printInfoForTheLastOutgoingCall() {
		if(this.lastOutgoingCall != null) {
			System.out.println("Last Outgoing call for " + this.simMobileNumber + " : ");
			System.out.println("Caller : " + this.lastOutgoingCall.caller.simMobileNumber);
			System.out.println("Receiver : " + this.lastOutgoingCall.receiver.simMobileNumber);
			System.out.println("Duration : " + this.lastOutgoingCall.duration + "min.");
		}
	}
	
	void printInfoForTheLastIncomingCall() {
		if(this.lastIncomingCall != null) {
			System.out.println("LastIncoming call for " + this.simMobileNumber + " : ");
			System.out.println("Caller : " + this.lastIncomingCall.caller.simMobileNumber);
			System.out.println("Receiver : " + this.lastIncomingCall.receiver.simMobileNumber);
			System.out.println("Duration : " + this.lastIncomingCall.duration + "min.");
		}
	}

}
