import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		double number1 = sc.nextDouble();
		System.out.println("Въведи числото B = ");
		double number2 = sc.nextDouble();
		System.out.println("Въведи числото C = ");
		double number3 = sc.nextDouble();
		if (number3 < number1 && number3 < number2) {
			System.out.println("Числото " + number3 + " е по-малко от " + number1 + " и " + number2);	
		} else {
			if (number3 > number1 && number3 > number2) {
				System.out.println("Числото " + number3 + " е по-голямо от " + number1 + " и " + number2);
		} else {
			System.out.println("Числото " + number3 + " е между " + number1 + " и " + number2);
		}
		}
	}

}
