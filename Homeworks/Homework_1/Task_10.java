import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи обем = ");
		int volume = sc.nextInt();
		int numberOfBuckets = volume / 5;
		int additionalVolume = volume % 5;
		if ( volume < 10 || volume > 9999) {
			System.out.println(" Обемът не е в дадения интервал!");
		}
		else {
			if (additionalVolume == 0 ) {
				System.out.println(numberOfBuckets + " пъти по 2 литра,");
				System.out.println(numberOfBuckets + " пъти по 3 литра,");
				System.out.println("Няма нужда от допълнителни кофи!");
			}
			if (additionalVolume == 2 ) {
				System.out.println(numberOfBuckets + " пъти по 2 литра,");
				System.out.println(numberOfBuckets + " пъти по 3 литра,");
				System.out.println("Допълнително кофа от 2 литра!");
			}
			if (additionalVolume == 3 ) {
				System.out.println(numberOfBuckets + " пъти по 2 литра,");
				System.out.println(numberOfBuckets + " пъти по 3 литра,");
				System.out.println("Допълнително кофа от 3 литра!");
			}
			if (additionalVolume == 4 ) {
				System.out.println(numberOfBuckets + " пъти по 2 литра,");
				System.out.println(numberOfBuckets + " пъти по 3 литра,");
				System.out.println("Допълнително две кофи от 2 литра!");
			}
			if (additionalVolume == 1 ) {
				System.out.println((numberOfBuckets - 1) + " пъти по 2 литра,");
				System.out.println((numberOfBuckets - 1) + " пъти по 3 литра,");
				System.out.println("Допълнително две кофи от 3 литра!");
			}
	
		}
	}
}
