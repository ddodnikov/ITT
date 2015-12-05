import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число ot 2 do 27 : ");
		byte sum = sc.nextByte();
		
		for ( int i = 100; i < 1000; i++) {
			if (((i % 10) + (i / 100) + ((i / 10) % 10)) == sum) {
				System.out.print(i + ",");
			}
		}

	}

}
