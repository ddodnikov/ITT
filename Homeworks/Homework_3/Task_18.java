import java.util.Scanner;

public class Task_18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int[] firstArray = new int [10];
		int[] secondArray = new int [10];
		int[] thirdArray = new int [10];
		int index = 0;
		
		System.out.println("Vavedi masiv 1 : ");
		for (index = 0; index <= firstArray.length-1; index++) {
			firstArray[index] = scan.nextInt();
		}
		
		System.out.println("Vavedi masiv 2 : ");
		for (index = 0; index <= secondArray.length-1; index++) {
			secondArray[index] = scan.nextInt();
		}
		
		for (index = 0; index <= thirdArray.length-1; index++) {
			if (firstArray[index] >= secondArray[index]) {
				thirdArray[index] = firstArray[index];
			}
			else {
				thirdArray[index] = secondArray[index];
			}
		}
		
		for (index = 0; index <= thirdArray.length-1; index++) {
			System.out.print(firstArray[index] + ", ");
		}
		System.out.println();
		for (index = 0; index <= thirdArray.length-1; index++) {
			System.out.print(secondArray[index] + ", ");
		}
		System.out.println();
		for (index = 0; index <= thirdArray.length-1; index++) {
			System.out.print(thirdArray[index] + ", ");
		}

	}

}
