import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi izrechenie : ");
		String sentence = scan.nextLine();
		
		String help = "";
		
		for (int index = 0; index < sentence.length(); index++) {
			if(index == 0) {
				help += sentence.substring(0, 1).toUpperCase();
			} else {
				if(sentence.charAt(index - 1) == ' ') {
					help += sentence.substring(index, index+1).toUpperCase();
				} else {
					help += sentence.substring(index, index+1).toLowerCase();
				}
			}
		}

		System.out.println(help);
	}

}
