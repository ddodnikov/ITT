import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ 1�� ����� �� 10 �� 5555 : ");
		int first = sc.nextInt();
		System.out.println("������ 2�� ����� �� 10 �� 5555 : ");
		int second = sc.nextInt();
		
		if (first > second) {
			for ( int i = first; i >= second; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ",");
				}
			}
		}
		else {
			for ( int i = second; i >= first; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ",");
				}
			}
		}

	}

}
