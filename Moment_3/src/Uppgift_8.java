import java.util.Scanner;

public class Uppgift_8 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" Hur mycket pengar vill du sätta in? ");

		int insatta_pengar = input.nextInt();
		int minInt = 1;
		int maxInt = 6;

		input.close();

		//:Hittade en rad kod på nätet att slumpa fram ett tal mellan 1 och 6:
		int tarning_1 = (int) Math.floor(Math.random() * (maxInt - minInt + 1) + minInt);
		int tarning_2 = (int) Math.floor(Math.random() * (maxInt - minInt + 1) + minInt);

		System.out.println(" Första tärning: " + tarning_1 );
		System.out.println(" Andra  tärning: " + tarning_2 );
		
		if ( (tarning_1 == 1 && tarning_2 == 6) || (tarning_2 == 1 && tarning_1 == 6)) {

			int dubbelvinst = insatta_pengar * 3 ;
			System.out.println(" Dubbelvinst, " + dubbelvinst);

		} else if (tarning_1 + tarning_2 == 7) {
			
			int vinst = insatta_pengar * 2 ;
			System.out.println(" Vinst, " + vinst);
		
		} else if (tarning_1 == tarning_2) {
			
			System.out.println(" Par, " + insatta_pengar);
			
		} else {
			
			System.out.println(" Förlust, " + 0 + "kr");
			
		}
	}
}
