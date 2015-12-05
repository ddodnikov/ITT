import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Въведи  трицифрено число = ");
				int number = sc.nextInt();
				int hundreds = number / 100;
				int tens = ( number % 100 ) / 10;
				int ones = number % 10;
				if ( hundreds == 0 || tens ==0 || ones == 0 || number < 100 || number > 999) {
					System.out.println(" Има 0 в числото или не е трицифрено!");
				}
				else {
					if ( number % hundreds == 0) {
						System.out.println(" Числото се дели на стотиците си!");
					}
					else {
						System.out.println(" Числото не се дели на стотиците си!");
					}
					if ( number % tens == 0) {
						System.out.println(" Числото се дели на десетиците си!");
					}
					else {
						System.out.println(" Числото не се дели на десетиците си!");
					}
					if ( number % ones == 0) {
						System.out.println(" Числото се дели на единиците си!");
					}
					else {
						System.out.println(" Числото не се дели на единиците си!");
					}
				} 
			}

}
