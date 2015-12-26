package homework_8;

public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}

	public boolean getIsMale() {
		return isMale;
	}

	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}

	public Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.setIsMale(isMale);
	}
	
	public void showPersonInfo() {
		System.out.println("Information :");
		System.out.println("Name : " + this.getName());
		System.out.println("Age : " + this.getAge());
		System.out.print("Gender : ");
		if(this.isMale == true) {
			System.out.print("male");
			System.out.println();
		} else {
			System.out.print("female");
			System.out.println();
		}
	}

}
