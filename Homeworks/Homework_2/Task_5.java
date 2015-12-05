import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		int number1 = sc.nextInt();
		System.out.println("Въведи числото B = ");
		int number2 = sc.nextInt();
		if ( number1 < number2) {
			while (number1 <= number2) {
				System.out.print(number1 + " ");
				number1++;
			}
		}
		else {
			while (number2 <= number1) {
				System.out.print(number2 + " ");
				number2++;
			}
		}

	}

}
