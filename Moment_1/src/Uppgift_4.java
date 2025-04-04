import java.util.Scanner;

public class Uppgift_4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in antal sekunder:");
		int sec = input.nextInt();

		int hours = sec / 3600;
		int secLeft = sec%3600;

		int min = secLeft/60;
		secLeft = secLeft%60;

		System.out.println(hours);
		System.out.println(min);
		System.out.println(secLeft);

	}
}


