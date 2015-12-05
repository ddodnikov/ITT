import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int [8];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		int[] newArray = new int[array.length];
		
		for (int index = 0; index < array.length; index++) {
			if (index < (array.length + 1) / 2) {
			newArray[index] = array[index];
		}
			else {
				newArray[index] = array[array.length + (array.length-1)/2- index];
			}
		}
		
		for (int index = 0; index < newArray.length; index++) {
			System.out.print(newArray[index] + ", ");
		}

	}

}
