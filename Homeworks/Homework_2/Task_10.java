import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		int x = sc.nextInt();
		int i ;
		boolean isIt = true;
		
		for (i = 2; i <= x/2; i++) {
			if (x % i == 0) {
				System.out.println("Числото не е просто!");
				isIt = false;
				break;
			}
		}
		if (isIt == true) {
			System.out.println("Числото е просто!");
		}

	}

}
