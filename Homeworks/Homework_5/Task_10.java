import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vavedi niz : ");
		String niz = scan.nextLine();
		
		char[] array = niz.toCharArray();
		String str = "";
		int ascii;
		
		for (int index = 0; index < array.length; index++) {
			ascii = ((int) array[index]) + 5;
			array[index] = (char) ascii;
			str += array[index];
		}
		
		System.out.println(str);

		
	}

}
