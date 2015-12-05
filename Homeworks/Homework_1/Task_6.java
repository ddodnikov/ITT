import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		int number1 = sc.nextInt();
		System.out.println("Въведи числото B = ");
		int number2 = sc.nextInt();
		System.out.println("Въведи числото C = ");
		int number3 = sc.nextInt();
		int help = number1;
		number1 = number2;
		number2 = number3;
		number3 = help;
		System.out.println("A = " + number1 + "; B = " + number2 + "; C = " + number3);
	}

}
