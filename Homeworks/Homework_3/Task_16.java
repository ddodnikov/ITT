import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		float[] array = new float [10];
		float[] newArray = new float[10];
		float sum = 0;
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextFloat();
		}
		
		for (int index = 0; index < newArray.length; index++) {
			if (array[index] < -0.231) {
				newArray[index] = index*index + 41.25f;
			}
			else {
				newArray[index] = (index + 1) * array[index];
			}
		}
		
		for (int index = 0; index < newArray.length; index++) {
			sum = sum + newArray[index];
		}
		
		for (int index = 0; index < newArray.length; index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.println();
		for (int index = 0; index < newArray.length; index++) {
			System.out.print(newArray[index] + ", ");
		}
		System.out.println();
		System.out.println("Srednata stoinost e : " + sum/10);

	}

}
