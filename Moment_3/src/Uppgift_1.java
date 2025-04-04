import java.util.Scanner;

public class Uppgift_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in personens langd cm:");
		int langden = input.nextInt();

		if(langden >= 190)
			System.out.println("Basketspelare");
		else{
			System.out.println("Handbollspelare");

		}
	}
}

