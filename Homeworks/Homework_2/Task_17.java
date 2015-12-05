import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число от 3 до 20 : ");
		byte number = sc.nextByte();
		System.out.println("Въведи символ : ");
		char symbol = sc.next().charAt(0);
		
		for ( int i = 1; i <= number; i++) {
			for ( int j = 1; j <= number; j++) {
				if (j == 1 || j == number || i == 1 || i == number) {
					System.out.print("*");
				}
				else {
					System.out.print(symbol);
				}
			}
			System.out.println();
		}

	}

}
