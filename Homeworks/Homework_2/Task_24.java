import java.util.Scanner;

public class Task_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число от 10 до 30 000 : ");
		int number = sc.nextInt();
		int reverse = 0;
		int n;
		int check = number;
		
		do {
			n = number % 10;
			reverse = (reverse * 10) + n;
			number = number / 10;
		}
		while (number > 0);
		
		if ( check == reverse) {
			System.out.println("Числото е палиндром!");
		}
		else {
			System.out.println("Числото не е палиндром!");
		}

	}

}
