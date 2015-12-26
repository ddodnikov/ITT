package homework_7;

public class StudentGroup {
	
	String groupSubject;
	Student[] students;
	byte freePlaces;
	
	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}
	
	void addStudent(Student s) {
		if(this.groupSubject.equals(s.subject) && this.freePlaces > 0) {
			for(int index = 0; index < this.students.length; index++) {
				if(this.students[index] == null) {
					this.students[index] = s;
					this.freePlaces--;
					break;
				}
			}
		}
	}
	
	void emptyGroup() {
		this.students = null;
		this.freePlaces = 5;
	}
	
	String theBestStudent() {
		String theBestStudent = this.students[0].name;
		for(int index = 1; index < this.students.length; index++) {
			if(this.students[index].grade > this.students[index-1].grade) {
				theBestStudent = this.students[index].name;
			}
		}
		return theBestStudent;
	}
	
	void printStudentsInGroup() {
		System.out.println("Subject " + this.groupSubject + " :");
		for(int index = 0; index < this.students.length; index++) {
			System.out.println("Student " + (index+1));
			System.out.println("Name : " + this.students[index].name);
			System.out.println("Age : " + this.students[index].age);
			System.out.println("Subject : " + this.students[index].subject);
			System.out.println("Year : " + this.students[index].yearInCollege);
			System.out.println("Grade : " + this.students[index].grade);
			System.out.println("Scholarship : " + this.students[index].money);
		}
	}

}
