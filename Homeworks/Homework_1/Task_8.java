import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число от 1000 до 9999 : ");
		int number = sc.nextInt();
		int ones = number % 10 ;
		int tens = ( number % 100 ) / 10 ;
		int hundreds = ( number % 1000 ) / 100 ;
		int thousands = number / 1000 ;
		int number1 = 10 * thousands + ones ;
		int number2 = 10 * hundreds + tens ;
		if ( number < 1000 || number > 9999 ) {
			System.out.println(" Числото не е в дадения интервал!");
		}
		else {
			if ( number1 < number2 ) {
				System.out.println(number1 + " < " + number2);
			}
			else {
				if ( number1 == number2 ) {
					System.out.println(number1 + " = " + number2);
				}
				else {
					System.out.println(number1 + " > " + number2);
				}
			}
		}
	}

}
