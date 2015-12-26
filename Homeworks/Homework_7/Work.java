package homework_7;

public class Work {

	public static void main(String[] args) {
		
		Employee one = new Employee("Ivan Markov");
		Employee two = new Employee("Mariq Koceva");
		
		one.setnameOfWorker("Dimitar Mitev");
		two.setnameOfWorker("Katq Marinova");;
		
		one.sethoursLeft(8);
		two.sethoursLeft(4);
		
		Task cleaning = new Task("Cleaning", 5);
		one.currentTask = cleaning;
		Task moving = new Task("Moving", 7);
		two.currentTask = moving;

		one.work();
		two.work();
		
		one.showReport();
		two.showReport();

		one.currentTask = moving;
		one.work();
		one.showReport();
	}

}
