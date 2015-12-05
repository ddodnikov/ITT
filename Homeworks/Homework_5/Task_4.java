import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi imena : ");
		String names = scan.nextLine();
		
		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int index = 0; index < names.length(); index++) {
			if (names.charAt(index) == ',') {
				count = index;
			}
		}
			
		for (int index = 0; index < count; index++) {
			sum1 += names.substring(0, count).codePointAt(index);
		}

		for (int index = 0; index < names.length() - count - 3; index++) {
			sum2 += names.substring(count + 2, names.length()-1).codePointAt(index);
		}
		sum2 += names.codePointAt(names.length() - 1);
		
		if (sum1 > sum2) {
			System.out.println(sum1 + " > " + sum2);
			System.out.println(names.substring(0, count));
		}
		if (sum1 == sum2) {
			System.out.println(sum1 + " = " + sum2);
			System.out.println("Ravni sa!");
		}
		if (sum1 < sum2) {
			System.out.println(sum1 + " < " + sum2);
			System.out.println(names.substring(count + 2, names.length()));
		}

	}

}
