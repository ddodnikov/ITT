import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi razmer 1vi masiv : ");
		int number1 = scan.nextInt();
		System.out.println("Vavedi razmer 2ri masiv : ");
		int number2 = scan.nextInt();
		int[] array1 = new int[number1];
		int[] array2 = new int[number2];
		
		System.out.println("Vavedi 1vi masiv : ");
		for (int index = 0; index < number1; index++) {
			array1[index] = scan.nextInt();
		}
		
		System.out.println("Vavedi 2ri masiv : ");
		for (int index = 0; index < number2; index++) {
			array2[index] = scan.nextInt();
		}
		
		if (array1.length == array2.length) {
			System.out.println("Masivite sa s ednakvi razmeri!");
			int index;
			for (index = 0; index < array1.length; index++) {
				if (array1[index] != array2[index]) {
					System.out.println("Masivivite ne sa ravni!");
					break;
				}
			}
			if (index == array1.length) {
				System.out.println("Masivite sa ravni!");
			}
		}
		else {
			System.out.println("Masivite sa s razli4ni razmeri , ne sa ravni!");
		}
	}

}
