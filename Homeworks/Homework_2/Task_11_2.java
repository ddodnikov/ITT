import java.util.Scanner;

public class Task_11_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		byte x = sc.nextByte();
		
		for ( int i = 1; i < x; i++) {
			for ( int j = 1; j <= 2*x - 1; j++) {
				if (j == (x - i + 1) || j == (x + i - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for ( int k = 1; k <= 2*x - 1; k++) {
			System.out.print("*");
		}

	}

}
