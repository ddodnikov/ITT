import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int [7];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		int min = array[0];
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] % 3 == 0 && array[index] < min) {
				min = array[index];
			}
		}
		System.out.println("Nai-malkoto chislo koeto se deli na 3 e : " + min);

	}

}
