import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		int[] array = new int [7];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] > 5 && array[index] % 5 == 0) {
				System.out.println(array[index] + ", ");
			}
		}

	}

}
