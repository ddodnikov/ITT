import java.util.Scanner;

public class Task_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи число : ");
		int number = sc.nextInt();
		int factoriel = 1;
		int i = 1;
		
		do {
			factoriel = factoriel * i;
			i ++;
		}
		while (i <= number);
		System.out.println(factoriel);

	}

}
