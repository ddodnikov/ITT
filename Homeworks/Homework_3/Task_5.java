
public class Task_5 {

	public static void main(String[] args) {
		

		int[] array = new int [10];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = index*3;
		}
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}

	}

}
