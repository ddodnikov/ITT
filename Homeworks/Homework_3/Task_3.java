import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi chislo : ");
		int number = scan.nextInt();
		int[] array = new int [10];
		
		for (int index = 0; index < array.length; index++) {
			if (index < 2) {
			array[index] = number;
		}
			else {
				array[index] = array[index - 1] + array[index - 2];
			}
		}
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}
	}

}
