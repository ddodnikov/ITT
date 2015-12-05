import java.util.Scanner;

public class Task_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число от 1 до 999 : ");
		int number = sc.nextInt();
		int k = 0;
		int j = number + 1;
		
		while ( j < 999) {
			if ((j % 2 == 0) || (j % 3 == 0) || (j % 5 == 0)) {
				k++;
				System.out.print(k + ":" + j + "; ");
			}
			if (k == 10) {
				break;
			}
			j++;
		}
		
	}

}
