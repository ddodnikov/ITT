import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi parvi niz : ");
		String firstStr = scan.nextLine();
		System.out.println("Vavedi vtori niz : ");
		String secondStr = scan.nextLine();
		
		System.out.print(firstStr.toUpperCase() + " " + firstStr.toLowerCase());
		System.out.println();
		System.out.print(secondStr.toUpperCase() + " " + secondStr.toLowerCase());

	}

}
