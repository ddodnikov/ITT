
public class Task_5 {

	public static void main(String[] args) {
		
		int[][] array = {
				{48,72,13,14},
				{21,22,53,24},
				{31,57,33,34},
				{41,95,43,44}
			};
		
		int sumRow = 0;
		int sumCol = 0;
		int sumRowMax = array[0][0] + array[0][1] + array[0][2] + array[0][3];
		int sumColMax = array[0][0] + array[1][0] + array[2][0] + array[3][0];
		
		for (int index = 0;index < array.length; index++) {
			for (int sec = 0;sec < array[0].length; sec++) {
				sumRow = sumRow + array[index][sec];
			}
			if (sumRow > sumRowMax) {
				sumRowMax = sumRow;
			}
			sumRow = 0;
		}
		
		for (int sec = 0;sec < array[0].length; sec++) {
			for (int index = 0;index < array.length; index++) {
				sumCol = sumCol + array[index][sec];
			}
			if (sumCol > sumColMax) {
				sumColMax = sumCol;
			}
			sumCol = 0;
		}
		
		System.out.println("Nai-golqmata suma po redove e : " + sumRowMax);
		System.out.println("Nai-golqmata suma po koloni e : " + sumColMax);
		if (sumRowMax > sumColMax) {
			System.out.println("Maksimalnata suma po redove e > ot maksimalnata suma po koloni!");
		}
		else {
			System.out.println("Maksimalnata suma po redove e < ot maksimalnata suma po koloni!");
		}
	}

}
