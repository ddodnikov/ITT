import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vavedi niz : ");
		String niz = scan.nextLine();
		
		int index = 0;
		int count = 0;
		
		while (index < niz.length()) {
			
			if (niz.codePointAt(index) >= 49 && niz.codePointAt(index) <= 57) {
				while (niz.codePointAt(index) >= 49 && niz.codePointAt(index) <= 57 && index < niz.length()) {
					count++;
					index++;
				}
				System.out.println(count);
				index += count;
				count = 0;
			} else {
				index++;
				count = 0;
			}
		}
			

	}

}
