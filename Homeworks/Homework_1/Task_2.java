import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� � = ");
		int number1 = sc.nextInt();
		System.out.println("������ ������� B = ");
		int number2 = sc.nextInt();
		long suma = number1 + number2;
		long razlika = number1 - number2;
		long proizvedenie = number1 * number2;
		int ostatak = number1 % number2;
		int chastno = number1 / number2;
		System.out.println(suma + " ; " + razlika + " ; " + proizvedenie + " ; " + ostatak + " ; " + chastno);
		
		System.out.println("������ ������� �1 = ");
		double number3 = sc.nextDouble();
		System.out.println("������ ������� B1 = ");
		double number4 = sc.nextDouble();
		double sumaNew = number3 + number4;
		double razlikaNew = number3 - number4;
		double proizvedenieNew = number3 * number4;
		double ostatakNew = number3 % number4;
		double chastnoNew = number3 / number4;
		System.out.println(sumaNew + " ; " + razlikaNew + " ; " + proizvedenieNew + " ; " + ostatakNew + " ; " + chastnoNew);
	}

}
