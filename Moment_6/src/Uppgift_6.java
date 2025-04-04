import java.util.Scanner;

public class Uppgift_6 {
	public static void printRomb(int side) {

		for (int i = 0; i < side; i++) {

			for (int y = 0; y < i; y++) {

				System.out.print(" ");
			}

			for (int k = 0; k < side; k++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hur många rader av stjärnor?");
		int rader = input.nextInt();
		
		printRomb(rader); 
		input.close();
	}
}
