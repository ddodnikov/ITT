
public class Task_1 {

	public static void main(String[] args) {
		
		int[][] array = {
							{48,72,13,14,15},
							{21,22,53,24,75},
							{31,57,33,34,35},
							{41,95,43,44,45},
							{59,52,53,54,55},
							{61,69,63,64,65}
						};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int index = 0;index < array.length; index++) {
			for (int sec = 0;sec < array[0].length; sec++) {
				if (array[index][sec] > max) {
					max = array[index][sec];
				}
				if (array[index][sec] < min) {
					min = array[index][sec];
				}
			}
		}
		System.out.println("Nai-golqmoto chislo e : " + max);
		System.out.println("Nai-malkoto chislo e : " + min);

	}

}
