import java.util.Scanner;

public class Task_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число от 0 до 24 : ");
		float number = sc.nextFloat();
		if (number >= 0 && number <= 24) {
			if (number >= 4 && number < 9) {
				System.out.println(" Добро утро! ");
			}else {
				if (number >= 9 && number < 18) {
					System.out.println(" Добър ден! ");
				}else {
				System.out.println(" Добър вечер! ");
				}
			}
		}
			else {
			System.out.println(" Числото не е в дадения интервал! ");
			}
	}
}	
