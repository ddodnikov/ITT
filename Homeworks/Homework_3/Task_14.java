import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		double[] array = new double [7];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextDouble();
		}
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] >= -2.99 && array[index] <= 2.99) {
				System.out.print(array[index] + ", ");
			}
		}

	}

}
