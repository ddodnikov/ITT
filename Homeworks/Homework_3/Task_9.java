	import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		int[] array = new int[7];
		int a;
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		for (int index = 0; index < array.length / 2; index++) {
			a = array[array.length - 1 - index];
			array[array.length - 1 - index] = array[index];
			array[index] = a;
		}
		
		for (int index = array.length - 1; index >= 0; index--) {
			System.out.print(array[index] + ", ");
		}

	}

}
