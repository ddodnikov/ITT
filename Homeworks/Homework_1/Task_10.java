import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� = ");
		int volume = sc.nextInt();
		int numberOfBuckets = volume / 5;
		int additionalVolume = volume % 5;
		if ( volume < 10 || volume > 9999) {
			System.out.println(" ������ �� � � ������� ��������!");
		}
		else {
			if (additionalVolume == 0 ) {
				System.out.println(numberOfBuckets + " ���� �� 2 �����,");
				System.out.println(numberOfBuckets + " ���� �� 3 �����,");
				System.out.println("���� ����� �� ������������ ����!");
			}
			if (additionalVolume == 2 ) {
				System.out.println(numberOfBuckets + " ���� �� 2 �����,");
				System.out.println(numberOfBuckets + " ���� �� 3 �����,");
				System.out.println("������������ ���� �� 2 �����!");
			}
			if (additionalVolume == 3 ) {
				System.out.println(numberOfBuckets + " ���� �� 2 �����,");
				System.out.println(numberOfBuckets + " ���� �� 3 �����,");
				System.out.println("������������ ���� �� 3 �����!");
			}
			if (additionalVolume == 4 ) {
				System.out.println(numberOfBuckets + " ���� �� 2 �����,");
				System.out.println(numberOfBuckets + " ���� �� 3 �����,");
				System.out.println("������������ ��� ���� �� 2 �����!");
			}
			if (additionalVolume == 1 ) {
				System.out.println((numberOfBuckets - 1) + " ���� �� 2 �����,");
				System.out.println((numberOfBuckets - 1) + " ���� �� 3 �����,");
				System.out.println("������������ ��� ���� �� 3 �����!");
			}
	
		}
	}
}
