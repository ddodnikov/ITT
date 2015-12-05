import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		double number1 = sc.nextDouble();
		System.out.println("Въведи числото B = ");
		double number2 = sc.nextDouble();
		if (number1 > number2) {
			System.out.println(number2 + " ; " + number1);
		}else {
			System.out.println(number1 + " ; " + number2);
		}
		
	}

}
