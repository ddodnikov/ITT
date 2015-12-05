import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведи по-малкото число A : ");
		int smallerNumber = scan.nextInt();
		System.out.println("Въведи по-голямото число B : ");
		int greaterNumber = scan.nextInt();
		int index = smallerNumber;
		int number = 0;
		int sum = 0;
		
		while (index <= greaterNumber) {
			if (index % 3 != 0) {
				if (sum > 200) {
					break;
				}
				System.out.println(index * index + ", ");
				sum = sum + index*index;
			}
			else {
				System.out.println("Skip " + index);
			}
			index++;
		}
		

	}

}
