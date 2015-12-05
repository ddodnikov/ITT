import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Въведи число : ");
		byte x = scan.nextByte();
		byte help = -1;
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print((x + help ));
			}
			help += 2;
			System.out.println();
		}

	}

}
