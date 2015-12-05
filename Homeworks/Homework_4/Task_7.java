
public class Task_7 {

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
		int numbers = array.length * array[0].length;
		for (int index = 0;index < numbers; index++) {
			int row = index / 6;
			int col = index % 6;
			if ((row + col) % 2 == 0) {
				sumOne = sumOne + array[row][col];
				sumAll = sumAll + array[row][col];
				System.out.print(array[row][col] + ", ");
			}
			if (index % 6 == 5) {
			System.out.print(" suma ot elementite za reda : " + sumOne);
			System.out.println();
			sumOne = 0;
			}
		}

		System.out.println("Suma na elementite : " + sumAll);

	}

}
