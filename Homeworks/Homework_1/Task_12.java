import java.util.Scanner;

public class Task_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи ден : ");
		int day = sc.nextInt();
		System.out.println("Въведи месец : ");
		int month = sc.nextInt();
		System.out.println("Въведи година : ");
		int year = sc.nextInt();
		int nextDay = day + 1;
		int nextMonth = month + 1;
		int nextYear = year +1;
		int viso1 = year % 4;
		int viso2 = (year / 100) % 4;
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ) {
			if ( day < 31) {
				System.out.println( nextDay + " , " + month + " , " + year);
			}
			else {
				System.out.println("1 , " + nextMonth + " , " + year);
				}
			}
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if ( day < 30) {
					System.out.println( nextDay + " , " + month + " , " + year);
				}
				else {
					System.out.println("1 , " + nextMonth + " , " + year);
				}
			}
			if (month == 12) {
				if ( day < 31) {
					System.out.println( nextDay + " , " + month + " , " + year);
				}
				else {
					System.out.println("1 , 1 , " + nextYear);
				}
			}
			if (month == 2) {
				if (viso1 != 0 || viso2 != 0) {
					if ( day < 28) {
						System.out.println( nextDay + " , " + month + " , " + year);
					}
					else {
						System.out.println("1 , " + nextMonth + " , " + year);
					}
				}
				else {
					if ( day < 29) {
						System.out.println( nextDay + " , " + month + " , " + year);
					}
					else {
						System.out.println("1 , " + nextMonth + " , " + year);
					}
				}
			}
		}
	}

