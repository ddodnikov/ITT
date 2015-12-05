
public class Task_13 {
	
	static int[] combine (int[] arrayOne, int[] arrayTwo) {
		int[] newArray = new int[arrayOne.length + arrayTwo.length];
		for (int index = 0; index < newArray.length; index++) {
			if (index < arrayOne.length) {
				newArray[index] = arrayOne[index];
			} else {
				newArray[index] = arrayTwo[index - arrayTwo.length];
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		int[] c = combine(a,b);
		for (int index = 0; index < c.length; index++) {
			System.out.print(c[index] + " ");
		}

	}

}
