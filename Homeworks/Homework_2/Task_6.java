import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		int number1 = sc.nextInt();
		int sum = 0;
		if (number1 > 1) {
			for (int i =1; i <= number1 ; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
		else {
			for (int i =1; i >= number1 ; i--) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}

}
