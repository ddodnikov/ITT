
public class Task_12 {
	
	static int[] returnArray (int number) {
		
		int[] array = new int[number];
		int num = 0;
		for (int index = 0; index < array.length; index++) {
			num++;
			array[index] = num;
		}
		return array;
		
	}

	public static void main(String[] args) {
		
		int number = 22;
		int[] array = returnArray(number);
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

	}

}
