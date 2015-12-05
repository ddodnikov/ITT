import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi parva duma : ");
		String firstWord = scan.nextLine();
		System.out.println("Vavedi vtora duma : ");
		String secondWord = scan.nextLine();
		
		if (firstWord.length() > secondWord.length()) {
			System.out.print(firstWord.length());
		} else {
			System.out.print(secondWord.length());
		}
		
		char[] firstArr = firstWord.toCharArray();
		char[] secondArr = secondWord.toCharArray();
		char[] thirdArr = firstWord.toCharArray();
		
		for (int index = 0; index < 5; index++) {
			firstArr[index] = secondArr[index];
			secondArr[index] = thirdArr[index];
		}
		String first = new String(firstArr);
		String second = new String(secondArr);
		
		System.out.print(" " + first + " " + second);

	}

}
