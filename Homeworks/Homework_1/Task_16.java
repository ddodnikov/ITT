import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���������� ����� : ");
		int number = sc.nextInt();
		int hundreds = number / 100;
		int tens = ( number % 100 ) / 10;
		int ones = number % 10;
		if ( number < 100 || number > 999) {
			System.out.println(" ������� �� � � ������� ��������!");
		}
		if ( hundreds == tens && tens == ones) {
			System.out.println(" ������� �� �����!");
		}
		else {
			if ( hundreds > tens && tens > ones) {
				System.out.println(" ������� �� ��� �������� ���!");
			}
			else {
				if (hundreds < tens && tens < ones) {
					System.out.println(" ������� �� ��� �������� ���!");
				}
				else {
					System.out.println(" ������� �� ����������!");
				}
			}
		}
	} 
}

