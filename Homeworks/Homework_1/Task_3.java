import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		int number1 = sc.nextInt();
		System.out.println("Въведи числото B = ");
		int number2 = sc.nextInt();
		int number3 = number1;
		number1 = number2;
		number2 = number3;
		System.out.println("A = " + number1 + "; B = " + number2);
		

	}

}
