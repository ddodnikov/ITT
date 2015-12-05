import java.util.Scanner;

public class Task_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vavedi masiv : ");
		
		double [] array = new double [6];
		double [] newArray = new double [6];
		double max = Double.MIN_VALUE;
		int first = 0;
		int second = 0;
		int third = 0;
		boolean threeNumbers= true;
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextDouble();
		}
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] < 0) {
				newArray[index] = - array[index];
			}
			else {
				newArray[index] = array[index];
			}
		}
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.println();
		
		for (int index = 0; index < newArray.length - 2; index++) {
			for (int inde = index + 1; inde < newArray.length - 1; inde++) {
				for (int ind = inde + 1; ind < newArray.length; ind++) {
					if ((newArray[index] + newArray[inde] + newArray[ind]) > max) {
						if (newArray[index] != newArray[inde] && newArray[inde] != newArray[ind] && newArray[index] != newArray[ind]) {
							max = newArray[index] + newArray[inde] + newArray[ind];
							first = index;
							second = inde;
							third = ind;
							threeNumbers = false;
						} 
					}
				}
			}
		}
		if (threeNumbers == true) {
			System.out.println("Няма три различни числа!");
		} else {
			System.out.println(newArray[first] + ", " + newArray[second] + ", " + newArray[third]);
		}
	}

}
