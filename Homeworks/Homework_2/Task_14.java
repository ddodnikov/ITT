import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число ot 10 do 200 : ");
		int number = sc.nextInt();
		
		for ( int i = number; i > 10; i--) {
			if (i % 7 == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
