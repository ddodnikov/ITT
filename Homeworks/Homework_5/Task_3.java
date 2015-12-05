import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi parva redica : ");
		String firstStr = scan.nextLine();
		System.out.println("Vavedi vtora redica : ");
		String secondStr = scan.nextLine();
		int min = 0;
		if (firstStr.length() > secondStr.length()) {
			System.out.println("Parviqt niz e po-dalag ot vtoriq!");
			min = secondStr.length();
		} else {
			if (firstStr.length() < secondStr.length()) {
			System.out.println("Vtoriqt niz e po-dalag ot parviq!");
			min = firstStr.length();
			} else {
				System.out.println("Dvata niza sa s ravna daljina!");
				min = secondStr.length();
			}
		}
		
		System.out.println("Razlika po pozicii : ");
		int position = 0;
		for (int index = 0; index < min; index++) {
			if (firstStr.charAt(index) != secondStr.charAt(index)) {
				position = index + 1;
				System.out.println(position + ", " + firstStr.charAt(index) + " - " + secondStr.charAt(index));
			}
			position = 0;
		}


	}

}
