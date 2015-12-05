
public class Task_23 {

	public static void main(String[] args) {
		
		int one = 1;
		int two = 1;
		do {
			for (two = one; two <= 9; two++) {			
				System.out.print(one + "*" + two + "; ");
				if (two == 9) {
					System.out.println();
				}
			}
			one++;
		} while (one <= 9);

	}

}
