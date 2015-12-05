import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи 1во число от 10 до 5555 : ");
		int first = sc.nextInt();
		System.out.println("Въведи 2ро число от 10 до 5555 : ");
		int second = sc.nextInt();
		
		if (first > second) {
			for ( int i = first; i >= second; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ",");
				}
			}
		}
		else {
			for ( int i = second; i >= first; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ",");
				}
			}
		}

	}

}
