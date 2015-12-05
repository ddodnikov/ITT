import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи числото А = ");
		double number1 = sc.nextDouble();
		System.out.println("Въведи числото B = ");
		double number2 = sc.nextDouble();
		System.out.println("Въведи числото C = ");
		double number3 = sc.nextDouble();
		
		if (number1 > number2 && number2 > number3) {
			System.out.println(number1 + " ; " + number2 + " ; " + number3);
		} 
		if (number1 > number2 && number3 > number1) {
			System.out.println(number3 + " ; " + number1 + " ; " + number2);
		} 
		if (number2 > number1 && number1 > number3) {
			System.out.println(number2 + " ; " + number1 + " ; " + number3);
		} 
		if (number2 > number1 && number3 > number2) {
			System.out.println(number3 + " ; " + number2 + " ; " + number1);
		} 
		if (number1 > number3 && number3 > number2) {
			System.out.println(number1 + " ; " + number3 + " ; " + number2);
		} 
		if (number2 > number3 && number3 > number1) {
			System.out.println(number2 + " ; " + number3 + " ; " + number1);
		} 
		}

	}

