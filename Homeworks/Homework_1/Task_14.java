import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи координата X на първата позиция : ");
		byte a1 = sc.nextByte();
		System.out.println("Въведи координата Y на първата позиция : ");
		byte b1 = sc.nextByte();
		System.out.println("Въведи координата X на втората позиция : ");
		byte a2 = sc.nextByte();
		System.out.println("Въведи координата Y на втората позиция : ");
		byte b2 = sc.nextByte();
		byte c1 = (byte) ((a1 + b1)%2);
		byte c2 = (byte) ((a2 + b2)%2);
		
		if ((c1 == 0 && c2 == 0) || (c1 == 1 && c2 == 1)) {
			System.out.println(" Позициите са с еднакъв цвят! ");
		} else {
			System.out.println(" Позициите са с различен цвят! ");
		}

	}

}
