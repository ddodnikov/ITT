package homework_7;

public class College {

	public static void main(String[] args) {
		
		Student firstStudent = new Student("Dimitar Ivanov Petrov", "Biology", 19);
		Student secondStudent = new Student("Plamena Vasileva Doncheva", "Biology", 19);
		Student thirdStudent = new Student("Maria Milova Vileva", "Biology", 19);
		
		Student fourthStudent = new Student("Victor Mitev Petkov", "Chemistry", 21);
		Student fifthStudent = new Student("Petar Stoilov Karatev", "Chemistry", 21);
		
		Student sixthStudent = new Student("Milena Stoyanova Kovacheva", "Math", 22);
		Student seventhStudent = new Student("Nikolai Yanev Martinov", "Math", 22);
		Student eighthtudent = new Student("Martin Ivanov Markov", "Math", 30);
		Student ninthStudent = new Student("Petko Stoilov Zarkov", "Math", 22);
		Student tenthStudent = new Student("Ivan Milev Tonchev", "Math", 22);
		Student eleventhStudent = new Student("Lubomir Stiliyanov Minchev", "Math", 22);
		
		firstStudent.upYear();
		fourthStudent.grade = 3;
		fourthStudent.upYear();
		sixthStudent.grade = 4;
		sixthStudent.upYear();
		
		firstStudent.grade = 5.5;
		secondStudent.grade = 5.25;
		thirdStudent.grade = 5.0;
		fourthStudent.grade = 4.5;
		fifthStudent.grade = 4.75;
		sixthStudent.grade = 5.75;
		seventhStudent.grade = 4.35;
		eighthtudent.grade = 5.85;
		ninthStudent.grade = 4.25;
		tenthStudent.grade = 3.95;
		
		secondStudent.receiveScholarship(4.0, 500);
		firstStudent.receiveScholarship(4.0, 500);
		
		fifthStudent.receiveScholarship(4.25, 450);
		
		sixthStudent.receiveScholarship(5.35, 600);
		eighthtudent.receiveScholarship(5.35, 600);
		
		StudentGroup group1 = new StudentGroup("Biology");
		StudentGroup group2 = new StudentGroup("Chemistry");
		StudentGroup group3 = new StudentGroup("Math");
		
		group1.addStudent(firstStudent);
		group1.addStudent(secondStudent);
		group1.addStudent(thirdStudent);
		group2.addStudent(fourthStudent);
		group2.addStudent(fifthStudent);
		group3.addStudent(sixthStudent);
		group3.addStudent(seventhStudent);
		group3.addStudent(eighthtudent);
		group3.addStudent(ninthStudent);
		group3.addStudent(tenthStudent);
		group3.addStudent(eleventhStudent);
		
		group3.printStudentsInGroup();
		String theBestStudent =  group3.theBestStudent();
		System.out.println(theBestStudent);

	}

}
