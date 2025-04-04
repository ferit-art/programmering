import java.util.Scanner;

public class Uppgift_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Mata in ett årtal: ");

		try {
			int year = input.nextInt(); 

			if (year % 400 == 0) {
				System.out.println(year + " är ett skottår.");
			} else if (year % 100 == 0) {
				System.out.println(year + " är inte ett skottår.");
			} else if (year % 4 == 0) {
				System.out.println(year + " är ett skottår.");
			} else {
				System.out.println(year + " är inte ett skottår.");
			}
		} catch (Exception e) {
			System.out.println("Fel: Ange ett giltigt heltal."); 
		} finally {
			input.close(); 
		}
	}
}
