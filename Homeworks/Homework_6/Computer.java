package homework_6;

public class Computer {
	
	short year;
	double price;
	boolean isNotebook;
	short hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem) {
		if(newOperationSystem != null) {
			this.operationSystem = newOperationSystem;
		}
	}
	
	void useMemory(int memory) {
		if(memory > freeMemory || memory < 0) {
			System.out.println("Not enough free memory or incorrect input!");
		} else {
			this.freeMemory -= memory;
		}
	}
	
}
