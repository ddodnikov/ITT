import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведи число : ");
		byte x = scan.nextByte();
		
		for (int i = 1; i <= 3*x; i++) {
			if ( i % 3 == 0) {
				System.out.print(i + ",");
			}
		}

	}

}
