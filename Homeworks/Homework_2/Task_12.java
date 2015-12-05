
public class Task_12 {

	public static void main(String[] args) {
		

		for ( int i = 100; i < 1000; i++) {
			if ( (i % 10) != (i / 100) && (i % 10) != ((i / 10) % 10) && (i / 100) != ((i / 10) % 10)) {
				System.out.println(i);
			}
		}

	}

}
