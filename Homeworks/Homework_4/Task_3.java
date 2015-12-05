
public class Task_3 {

	public static void main(String[] args) {
		
		int[][] array = {
							{48,72,13,14,15},
							{21,22,53,24,75},
							{31,57,33,34,35},
							{41,95,43,44,45},
							{59,52,53,54,55},
							{61,69,63,64,65}
						};
		
		int sum = 0;
		int num = 0;

		
		for (int index = 0;index < array.length; index++) {
			for (int sec = 0;sec < array[0].length; sec++) {
				sum = sum + array[index][sec];
				num++;
			}
		}
		
		int average = sum/num;
		System.out.println("Sumata e : " + sum);
		System.out.println("Srednoaritmetichnoto e : " + average);

	}

}
