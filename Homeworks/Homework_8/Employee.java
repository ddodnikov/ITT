package homework_8;

public class Employee extends Person{

	private double daySalary;
	
	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if(daySalary > 0) {
			this.daySalary = daySalary;
		}
	}

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	public double calculateOvertime(double hours) {
		if(this.getAge() >= 18) {
			double overtimeSalary = ((this.getDaySalary() / 8)*hours*1.5);
			this.setDaySalary(this.getDaySalary() + overtimeSalary);
			return overtimeSalary;
		} else {
			return 0;
		}
	}
	
	public void showEmployeeInfo() {
		System.out.print("Employee ");
		this.showPersonInfo();
		System.out.println("Day salary : " + this.getDaySalary() + "$");
	}
	
}
