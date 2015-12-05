import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vavedi masiv : ");
		int[][] array = new int[4][4];
		for (int index = 0;index < array.length; index++) {
			for (int sec = 0;sec < array[0].length; sec++) {
				array[index][sec] = scan.nextInt();
			}
		}
		
		for (int index = 0;index < array.length; index++) {
			for (int sec = 0;sec < array[0].length; sec++) {
				if (index == sec) {
					System.out.print(array[index][sec] + ",");
				}
			}
		}
		System.out.println();
		
		for (int index = 0;index < array.length; index++) {
			for (int sec = 0;sec < array[0].length; sec++) {
				if (index + sec == 3) {
					System.out.print(array[index][sec] + ",");
				}
			}
		}

	}

}
