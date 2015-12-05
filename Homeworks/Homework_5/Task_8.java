import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vavedi niz : ");
		String niz = scan.nextLine();
		
		boolean isIt = true;
				
		for(int index = 0; index < niz.length() / 2; index++) {
			if(niz.charAt(index) != niz.charAt(niz.length() - 1 - index)) {
				isIt = false;
				break;
			} else {
				continue;
			}
		}
		
		if(isIt == true) {
			System.out.println("DA!");
		} else {
			System.out.println("NE!");
		}

	}

}
