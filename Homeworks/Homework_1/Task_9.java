import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� � = ");
		int number1 = sc.nextInt();
		System.out.println("������ ������� B = ");
		int number2 = sc.nextInt();
		int proizvedenie = number1 * number2 ;
		int ones = proizvedenie % 10 ;
		if ( number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99 ) {
			System.out.println(" ������� �� �� � ������� ��������!");
		}
		else {
			if ( proizvedenie % 2 == 0 ) {
				System.out.println(proizvedenie + ", " + ones + " � �����!");
			}
			else {
				System.out.println(proizvedenie + ", " + ones + " � �������!");
			}
		}
	}

}
