import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи трицифрено число : ");
		int number = sc.nextInt();
		int hundreds = number / 100;
		int tens = ( number % 100 ) / 10;
		int ones = number % 10;
		if ( number < 100 || number > 999) {
			System.out.println(" Числото не е в дадения интервал!");
		}
		if ( hundreds == tens && tens == ones) {
			System.out.println(" Цифрите са равни!");
		}
		else {
			if ( hundreds > tens && tens > ones) {
				System.out.println(" Цифрите са във възходящ ред!");
			}
			else {
				if (hundreds < tens && tens < ones) {
					System.out.println(" Цифрите са във низходящ ред!");
				}
				else {
					System.out.println(" Цифрите са ненаредени!");
				}
			}
		}
	} 
}

