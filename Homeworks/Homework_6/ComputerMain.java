package homework_6;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		Computer computer2 = new Computer();
		
		computer1.isNotebook = true;
		computer1.year = 2013;
		computer1.price = 849.99;
		computer1.hardDiskMemory = 500;
		computer1.freeMemory = 360;
		computer1.operationSystem = "Windows 7";
		
		computer2.isNotebook = false;
		computer2.year = 2010;
		computer2.price = 649.99;
		computer2.hardDiskMemory = 1000;
		computer2.freeMemory = 470.2;
		computer2.operationSystem = "Windows Vista";
		
		computer1.useMemory(120);
		computer2.changeOperationSystem("Windows 7");
		
		System.out.println("Computer 1 : " + computer1.year + "g. , " + computer1.price + "lv. , "
		+ computer1.hardDiskMemory + "GB , " + computer1.freeMemory + "GB , " + computer1.operationSystem);
		
		System.out.println("Computer 2 : " + computer2.year + "g. , " + computer2.price + "lv. , "
				+ computer2.hardDiskMemory + "GB , " + computer2.freeMemory + "GB , " + computer2.operationSystem);
		

	}

}
