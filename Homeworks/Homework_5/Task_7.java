import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi niz : ");
		String niz = scan.nextLine();
		
		int count = 1;
		int letters = 0;
		int max = 0;
		
		for (int index = 0; index < niz.length(); index++) {
			if(niz.charAt(index) != ' ') {
				letters++;
				if (max < letters) {
					max = letters;
				}
			} else {
				count++;
				letters = 0;
			}
		}
		
		System.out.println(count + " dumi, nai-dalgata e s " + max + " simvola.");
		
	}

}
