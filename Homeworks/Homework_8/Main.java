package homework_8;

public class Main {

	public static void main(String[] args) {
		
		Person[] people = new Person[10];
		
		people[0] = new Person("Ivan", 25, true);
		people[1] = new Person("Milena", 22, false);
		
		people[2] = new Student("Dimitar", 23, true, 5.45);
		people[3] = new Student("Hristina", 16, false, 5.55);
		
		people[4] = new Employee("Nikolai", 23, true, 100);
		people[5] = new Employee("Maria", 17, false, 60);
		
		for(int index = 0; index < people.length; index++) {
			if(people[index] != null) {
				if(people[index].getClass() == Person.class) {
					people[index].showPersonInfo();
				}
				if(people[index].getClass() == Student.class) {
					((Student) people[index]).showStudentInfo();
				}
				if(people[index].getClass() == Employee.class) {
					((Employee) people[index]).showEmployeeInfo();
				}
			}
		}

		for(int index = 0; index < people.length; index++) {
			if(people[index] != null) {
				if(people[index].getClass() == Employee.class) {
					double overtime = ((Employee) people[index]).calculateOvertime(2);
					System.out.println("Ovartime salary of " + people[index].getName() +
							" : " + overtime + "$");
				}
			}
		}
		
	}

}
