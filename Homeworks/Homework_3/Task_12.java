import java.util.Scanner;

public class Task_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		int[] array = new int [7];
		int c;
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		c = array[0];
		array[0] = array [1];
		array[1] = c;
		array[3] = array [2] + array [3];
		array[2] = array[3] - array[2];
		array[3] = array[3] - array[2];
		array[5] = array [4] * array [5];
		array[4] = array[5] / array[4];
		array[5] = array[5] / array[4];
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}

	}

}
