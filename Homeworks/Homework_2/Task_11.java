import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		byte x = sc.nextByte();
		
		for ( int i = 1; i <= x; i++) {
			for ( int j = 1; j <= 2*x; j++) {
				if ( (j >= (x - i + 1)) && (j <= (x + i - 1)) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
