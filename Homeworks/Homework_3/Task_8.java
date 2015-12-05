import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masive : ");
		int[] array = new int [10];
		int broi = 1;
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		int index2 = 0;
		while (index2 < array.length - 1) {
			if (array[index2] == array[index2 + 1]) {
			broi = broi + 1;
			}
			index2++;
		}
		
		System.out.println(broi);
	}

}
