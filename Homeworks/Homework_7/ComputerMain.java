package homework_7;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer(2005, 749.99, 40, 35.0);
		Computer computer2 = new Computer(2012, 499.99, 250, 233.5);
		Computer computer3 = new Computer(2010, 549.99, false, 500, 450.6, "Windows Vista");
		
		computer1.comparePrice(computer3);
		computer2.comparePrice(computer1);
		computer3.comparePrice(computer2);

	}

}
