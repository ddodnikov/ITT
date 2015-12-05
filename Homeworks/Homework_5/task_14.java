
public class task_14 {

	static int factoriel(int number) {
		if (number == 0) {
			return 1;
		}
		if (number == 1) {
			return 1;
		} else {
			return number * factoriel(number - 1);
		}
	}
	
	public static void main(String[] args) {
		
		int result = factoriel(5);
		System.out.println(result);

	}

}
