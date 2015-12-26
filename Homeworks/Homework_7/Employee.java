package homework_7;

public class Employee {
	
	private String nameOfWorker;
	private double hoursLeft;
	Task currentTask;
	
	public void setnameOfWorker(String name) {
		if(name != null) {
			this.nameOfWorker = name;
		}
	}
	
	public void sethoursLeft(double hours) {
		if(hours >= 0) {
			this.hoursLeft = hours;
		}
	}
	
	public String getnameOfWorker() {
		return this.nameOfWorker;
	}
	
	public double gethoursLeft() {
		return this.hoursLeft;
	}
	
	Employee(String name) {
		setnameOfWorker(name);
	}
	
	void work() {
		if(this.currentTask != null) {
			if(this.hoursLeft <= this.currentTask.getworkingHours()) {
				this.currentTask.setworkingHours(this.currentTask.getworkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
			} else {
				this.hoursLeft -= this.currentTask.getworkingHours();
				this.currentTask.setworkingHours(0);
			}
		}
	}
	
	void showReport() {
		this.work();
		System.out.println("Name of worker : " + this.nameOfWorker);
		System.out.println("Current task : " + this.currentTask.getnameOfTask());
		System.out.println("Working hours for the day left : " + this.hoursLeft);
		System.out.println("Hours till task is finished : " + this.currentTask.getworkingHours());
		System.out.println();
	}

}
