import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		double[] array = new double [7];
		double sum = 0;
		double number = 0;
		double min = Double.MAX_VALUE;
		double[] array2 = new double [7];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
		
		for (int index = 0; index < array.length; index++) {
			sum = sum + array[index];
		}
		
		double average = sum / 7;
		System.out.println("Srednata stoinost e : " + average);
		
		for (int index = 0; index < array2.length; index++) {
			if (array[index] > average) {
				array2[index] = array[index] - average;
			}
			else {
				array2[index] = average - array[index];
			}
		}
		
		for (int index = 0; index < array2.length; index++) {
			if (array2[index] < min){
				min = array2[index];
				number = array[index];
			}
		}
		System.out.println("Nai blizkata stoinost e : " + number);

	}

}
