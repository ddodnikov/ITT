import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��� - ");
		int hour = sc.nextInt();
		System.out.println("������ ���� - ");
		float money = sc.nextFloat();
		System.out.println("����� �� ���? -  ");
		boolean health = sc.nextBoolean();
		if (health == true) {
			if (money > 10) {
				System.out.println("����� ��� , ���� ������ �� 10�� , �� ����� �� ���� � ��������!");
			} else {
				System.out.println("����� ��� , �� ���� ��-����� �� 10�� , �� ����� �� ����!");
				}
			} else {
				if (money > 0) {
					System.out.println("����� ��� , ���� �� ������� , ���� ���� , �� �� ���� ���������!");
				} else {
					System.out.println("����� ��� , ���� �� ������� , ����� ���� , �� �� ���� ����� � �� ��� ���!");
					}
			}
		
	}

}
