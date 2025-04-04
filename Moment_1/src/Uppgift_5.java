import java.util.Scanner;

public class Uppgift_5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in 1. persons ålder:");
		float person1 = input.nextFloat();

		System.out.println("Skriv in 2. persons ålder:");
		float person2 = input.nextFloat();

		System.out.println("Skriv in 3. persons ålder:");
		float person3 = input.nextFloat();

		float medelåldern = (person1 + person2 + person3) / 3;

		System.out.println(medelåldern);
	}
}


