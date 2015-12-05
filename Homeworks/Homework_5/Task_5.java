import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi parva duma : ");
		String firstWord = scan.nextLine();
		System.out.println("Vavedi vtora duma : ");
		String secondWord = scan.nextLine();
		
		int row = -1;
		int col = -1;
		int index = 0;
		int sec = 0;
		boolean isIt = true;
		
		for (index = 0; index <= firstWord.length() - 1; index++) {
			for (sec = 0; sec <= secondWord.length() - 1; sec++) {
				if (firstWord.charAt(index) == secondWord.charAt(sec)) {
					row = sec;
					col = index;
					break;
				}
				if (index == (firstWord.length() - 1) && sec == (secondWord.length() - 1)) {
					System.out.println("Nqmat obshta bukva!");
					isIt = false;
					break;
				}
			}
			if (index == col) {
				break;
			}
		}

		
		if (isIt == true) {
			char[] array = new char[firstWord.length()];

			for (int ind = 0; ind < secondWord.length(); ind++) {
				for (int sec1 = 0; sec1 < firstWord.length(); sec1++) {
					if (ind == row) {
						array[sec1] = firstWord.charAt(sec1);
					} else {
						if (sec1 == col) {
							array[sec1] = secondWord.charAt(ind);
						} else {
							array[sec1] = ' ';
						}
					}
					System.out.print(array[sec1] + " ");
				}
				System.out.println();
			}
		}
				
	}

}
