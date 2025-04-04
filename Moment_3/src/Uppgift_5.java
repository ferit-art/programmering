import java.util.Scanner;

public class Uppgift_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Mata in tre åldrar!: ");

		int alder_1 = input.nextInt();
		int alder_2 = input.nextInt();
		int alder_3 = input.nextInt();

		if ( alder_1 < alder_2 && alder_1 < alder_3 ) {

			System.out.println(" Första åldern är minst! ");

		} else if ( alder_2 < alder_1 && alder_2 < alder_3 ) {

			System.out.println(" Andra åldern är minst! ");

		} else if ( alder_3 < alder_2 && alder_3 < alder_1) {

			System.out.println(" Tredje åldern är minst! ");

		}	
	}
}

