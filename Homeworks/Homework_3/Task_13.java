import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		int number = sc.nextInt();
		int length = 0;
		int help = number;
		
		while (help > 0) {
			help = help / 2;
			length++;
		}
		
		int array[] = new int[length];
		for (int index = length - 1; index >= 0; index--) {
			array[index] = number % 2;
			number = number / 2;
		}
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index]);
		}
		
	}

}
