import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи час - ");
		int hour = sc.nextInt();
		System.out.println("Въведи сума - ");
		float money = sc.nextFloat();
		System.out.println("Здрав ли съм? -  ");
		boolean health = sc.nextBoolean();
		if (health == true) {
			if (money > 10) {
				System.out.println("Здрав съм , имам повече от 10лв , ще отида на кино с приятели!");
			} else {
				System.out.println("Здрав съм , но имам по-малко от 10лв , ще отида на кафе!");
				}
			} else {
				if (money > 0) {
					System.out.println("Болен съм , няма да излизам , имам пари , ще си купя лекарства!");
				} else {
					System.out.println("Болен съм , няма да излизам , нямам пари , ще си стоя вкъщи и ще пия чай!");
					}
			}
		
	}

}
