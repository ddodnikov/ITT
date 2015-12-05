import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masive : ");
		int[] array = new int [5];
		int[] array2 = new int [5];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		for (int index = 0; index < array2.length; index++) {
			if (index == 0 || index == array.length - 1) {
				if (index == 0) {
				array2[index] = array[1] + array[array.length - 1];
			}
				else {
				array2[index] = array[index - 1] + array[0];
			}
			}
			else {
			array2[index] = array[index - 1] + array[index + 1];
			}
		}
		
		for (int index = 0; index < array2.length; index++) {
			System.out.print(array2[index] + ", ");
		}

	}

}
