import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int [8];
		int index = 0;
		
		for (index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		for (index = 0; index < array.length; index++) {
			if (array[index] != array[array.length - 1 - index]) {
				System.out.println("Masiva ne e ogledalen!");
				break;
			}
			if (index == (array.length - 1)) {
				System.out.println("Masiva e ogledalen!");
			}
		}
		
	}

}
