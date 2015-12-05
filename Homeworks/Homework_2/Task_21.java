import java.util.Scanner;

public class Task_21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведи номер карта(от 1 до 51) : ");
		int number = scan.nextInt();

		
		for(int index = number; index <= 52; index++) {
			if (index >= 1 && index <= 4) {
				System.out.print(" Двойка ");
			}
			if (index >= 5 && index <= 8) {
				System.out.print(" Тройка ");
			}
			if (index >= 9 && index <= 12) {
				System.out.print(" Четворка ");
			}
			if (index >= 13 && index <= 16) {
				System.out.print(" Петица ");
			}
			if (index >= 17 && index <= 20) {
				System.out.print(" Шестица ");
			}
			if (index >= 21 && index <= 24) {
				System.out.print(" Седмица ");
			}
			if (index >= 25 && index <= 28) {
				System.out.print(" Осмица ");
			}
			if (index >= 29 && index <= 32) {
				System.out.print(" Деветка ");
			}
			if (index >= 33 && index <= 36) {
				System.out.print(" Десетка ");
			}
			if (index >= 37 && index <= 40) {
				System.out.print(" Вале ");
			}
			if (index >= 41 && index <= 44) {
				System.out.print(" Дама ");
			}
			if (index >= 45 && index <= 48) {
				System.out.print(" Поп ");
			}
			if (index >= 49 && index <= 52) {
				System.out.print(" Асо ");
			}
			if (index % 4 == 0) {
				System.out.print("пика,");
			}
			if ((index % 2 == 0) && (index % 4 != 0)) {
				System.out.print("каро,");
			}
			if ((index + 3) % 4 == 0) {
				System.out.print("спатия,");
			}
			if ((index + 1) % 4 == 0) {
				System.out.print("купа,");
			}

		}

	}

}
