
public class task_6 {

	public static void main(String[] args) {
		
		int[][] array = {
							{48,72,13,14,15,10},
							{21,22,53,24,75,11},
							{31,57,33,34,35,12},
							{41,95,43,44,45,13},
							{59,52,53,54,55,14},
							{61,69,63,64,65,15}
						};
		int sumOne = 0;
		int sumAll = 0;
		
		for (int index = 1;index < array.length; index+=2) {
			for (int sec = 0;sec < array[1].length; sec++) {
				System.out.print(array[index][sec] + ",");
				sumOne = sumOne + array[index][sec];
				sumAll = sumAll + array[index][sec];
			}
			System.out.println(" suma " + sumOne);
			sumOne = 0;
		}
		System.out.println("Suma na elementite : " + sumAll);

	}

}
