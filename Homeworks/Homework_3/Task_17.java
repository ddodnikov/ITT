import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		int[] array = new int [8];
		int index = 0;
		
		for (index = 0; index <= array.length-1; index++) {
			array[index] = scan.nextInt();
		}
		
		for (index = 0; index <= array.length-3; index++) {
			if (array[index] > array[index + 1]) {
				if (array[index + 1] > array[index + 2]) {
					System.out.println("Redicata ne e zigzagoobrazna");
					break;
				}
			}
			else {
				if (array[index + 1] < array[index + 2]) {
					System.out.println("Redicata ne e zigzagoobrazna!");
					break;
				}
			}
			if (index == array.length - 3) {
				System.out.println("Redicata e zigzagoobrazna!");
		}
		}
		
	}
}

