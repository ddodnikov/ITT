package homework_8;

public class Student extends Person{

	private double score;
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if(score >= 2 && score <= 6){
			this.score = score;
		}
	}

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}
	
	public void showStudentInfo() {
		System.out.print("Student ");
		this.showPersonInfo();
		System.out.println("Score : " + this.getScore());
	}


}
