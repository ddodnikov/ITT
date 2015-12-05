import java.util.Scanner;

public class Task_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи 1во число от 1 до 9 : ");
		byte first = sc.nextByte();
		System.out.println("Въведи 2ро число от 1 до 9 : ");
		byte second = sc.nextByte();
		
		for (int i = 1; i <= first; i++) {
			for ( int j = 1; j <= second; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}

	}

}
