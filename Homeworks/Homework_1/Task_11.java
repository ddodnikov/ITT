import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("������  ���������� ����� = ");
				int number = sc.nextInt();
				int hundreds = number / 100;
				int tens = ( number % 100 ) / 10;
				int ones = number % 10;
				if ( hundreds == 0 || tens ==0 || ones == 0 || number < 100 || number > 999) {
					System.out.println(" ��� 0 � ������� ��� �� � ����������!");
				}
				else {
					if ( number % hundreds == 0) {
						System.out.println(" ������� �� ���� �� ��������� ��!");
					}
					else {
						System.out.println(" ������� �� �� ���� �� ��������� ��!");
					}
					if ( number % tens == 0) {
						System.out.println(" ������� �� ���� �� ���������� ��!");
					}
					else {
						System.out.println(" ������� �� �� ���� �� ���������� ��!");
					}
					if ( number % ones == 0) {
						System.out.println(" ������� �� ���� �� ��������� ��!");
					}
					else {
						System.out.println(" ������� �� �� ���� �� ��������� ��!");
					}
				} 
			}

}
