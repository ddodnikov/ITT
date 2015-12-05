import java.util.Scanner;

public class Task_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число от 10 до 99 : ");
		int number = sc.nextInt();

		while (number > 1) {
			 if ( ((number - 1) % 2) != 0) {
				 number = number / 2;
			 }
			 else {
				 number = number * 3 + 1;
			 }
			 System.out.print(number + " ");
		 }
			 
	 }

}
