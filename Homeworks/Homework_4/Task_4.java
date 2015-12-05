
public class Task_4 {

	public static void main(String[] args) {
		
		int[][] array = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55}
			};
		
		for (int index = 0; index < array.length; index++) {
			for (int sec = array[0].length - 1;sec >= 0; sec--) {
					System.out.print(array[sec][index] + ",");
			}
			System.out.println();
		}
		
	}

}
