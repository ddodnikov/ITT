import java.util.Scanner;

public class Task_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число : ");
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		do {
			sum = sum + i;
			i++;
		} while ( i <= number);
		
		System.out.println(sum);
	}

}
