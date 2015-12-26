package homework_7;

public class Computer {
	
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Windows XP";
	}
	
	Computer(int year , double price , int hardDiskMemory , double freeMemory) {
		this();
		if(year > 2000 && year < 2015)
			this.year = year;
		if(price > 0)
			this.price = price;
		if(hardDiskMemory > 0)
			this.hardDiskMemory = hardDiskMemory;
		if(freeMemory > 0)
			this.freeMemory = freeMemory;
	}
	
	Computer(int year , double price , boolean isNotebook ,
			int hardDiskMemory , double freeMemory , String operationSystem) {
		this(year,price,hardDiskMemory,freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	void changeOperationSystem(String newOperationSystem) {
		if(newOperationSystem != null) {
			this.operationSystem = newOperationSystem;
		}
	}
	
	void useMemory(int memory) {
		if(memory <= freeMemory && memory >= 0) {
			this.freeMemory -= memory;
		}
	}
	
	int comparePrice(Computer computerToCompareTo) {
		if(computerToCompareTo != null) {
			if(this.price > computerToCompareTo.price) {
				System.out.println("This computer is more expensive than the other one.");
				return -1;
			} else {
				if(this.price < computerToCompareTo.price) {
					System.out.println("This computer is less expensive than the other one.");
					return 1;
				} else {
					System.out.println("This computer costs as much as the other one.");
					return 0;
				}
			}
		} else {
			return 666;
		}
	}
	
}
