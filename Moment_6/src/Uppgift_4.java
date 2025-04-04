import java.util.Scanner;

public class Uppgift_4 {
	public static String[] printinfo(String name, String ssn, String phone) {
		
		String[] array = new String[3];
		array[0] = name;
		array[1] = ssn;
		array[2] = phone;

		return array;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Mata in namn, personnummer och telefonnummer:");
		String namn = input.nextLine();
		String personnummer = input.nextLine();
		String telefonnummer = input.nextLine();
		
		String[] utskrift = printinfo(namn,personnummer,telefonnummer);
		System.out.println("Namn: " + utskrift[0]);
        System.out.println("Personnummer: " + utskrift[1]);
		System.out.println("Telefon: " + utskrift[2]);
		
		input.close();
	}
}