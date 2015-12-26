package homework_7;

public class Student {

	String name;
	String subject;
	double grade;
	byte yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student() {
		this.grade = 4.0;
		this.isDegree = false;
		this.yearInCollege = 1;
		this.money = 0.0;
	}
	
	Student(String name, String subject, int age) {
		this();
		if(name != null)
			this.name = name;
		if(subject != null)
			this.subject = subject;
		if(age >= 12 && age <= 100)
			this.age = age;
	}
	
	void upYear() {
		if(this.yearInCollege == 4)
			System.out.println("The student has graduated!");
		if(this.yearInCollege == 3)
			this.yearInCollege++;
			this.isDegree = true;
		if(this.yearInCollege < 3)
			this.yearInCollege++;
	}
	
	double receiveScholarship(double min, double amount) {
		if(min >= 3.0 && min <= 6.0 && amount > 0)
			if(this.grade >= min && this.age < 30)
				this.money += amount;
		return this.money;		
	}
	
}
