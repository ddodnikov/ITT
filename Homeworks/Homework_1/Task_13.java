import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����������� �� -100 �� +100 : ");
		byte temperature = sc.nextByte();
		if ( temperature < -100 || temperature > 100) {
			System.out.println(" ������������� �� � � ������� ��������!");
		}
		else {
			if (temperature < -20) {
				System.out.println(" ������! ");
				} else {
					if (temperature >= -20 && temperature < 0) {
						System.out.println(" �������! ");
					} else {
						if(temperature >= 0 && temperature <15) {
							System.out.println(" ������! ");
						} else {
							if (temperature >=15 && temperature < 25) {
							System.out.println(" �����! ");
							} else {
								System.out.println(" ������! ");
							}
						}
					}
				}
		}
	}

}
