import java.util.Scanner;

public class Task_21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ����� �����(�� 1 �� 51) : ");
		int number = scan.nextInt();

		
		for(int index = number; index <= 52; index++) {
			if (index >= 1 && index <= 4) {
				System.out.print(" ������ ");
			}
			if (index >= 5 && index <= 8) {
				System.out.print(" ������ ");
			}
			if (index >= 9 && index <= 12) {
				System.out.print(" �������� ");
			}
			if (index >= 13 && index <= 16) {
				System.out.print(" ������ ");
			}
			if (index >= 17 && index <= 20) {
				System.out.print(" ������� ");
			}
			if (index >= 21 && index <= 24) {
				System.out.print(" ������� ");
			}
			if (index >= 25 && index <= 28) {
				System.out.print(" ������ ");
			}
			if (index >= 29 && index <= 32) {
				System.out.print(" ������� ");
			}
			if (index >= 33 && index <= 36) {
				System.out.print(" ������� ");
			}
			if (index >= 37 && index <= 40) {
				System.out.print(" ���� ");
			}
			if (index >= 41 && index <= 44) {
				System.out.print(" ���� ");
			}
			if (index >= 45 && index <= 48) {
				System.out.print(" ��� ");
			}
			if (index >= 49 && index <= 52) {
				System.out.print(" ��� ");
			}
			if (index % 4 == 0) {
				System.out.print("����,");
			}
			if ((index % 2 == 0) && (index % 4 != 0)) {
				System.out.print("����,");
			}
			if ((index + 3) % 4 == 0) {
				System.out.print("������,");
			}
			if ((index + 1) % 4 == 0) {
				System.out.print("����,");
			}

		}

	}

}
