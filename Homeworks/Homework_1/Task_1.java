import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� � = ");
		double number1 = sc.nextDouble();
		System.out.println("������ ������� B = ");
		double number2 = sc.nextDouble();
		System.out.println("������ ������� C = ");
		double number3 = sc.nextDouble();
		if (number3 < number1 && number3 < number2) {
			System.out.println("������� " + number3 + " � ��-����� �� " + number1 + " � " + number2);	
		} else {
			if (number3 > number1 && number3 > number2) {
				System.out.println("������� " + number3 + " � ��-������ �� " + number1 + " � " + number2);
		} else {
			System.out.println("������� " + number3 + " � ����� " + number1 + " � " + number2);
		}
		}
	}

}
