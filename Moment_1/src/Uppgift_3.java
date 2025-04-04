import java.util.Scanner;

public class Uppgift_3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in temparaturen i fahrenheit:");
		float Fahrenheit = input.nextFloat();

		float Celcius = (Fahrenheit - 32) * 0.56f;

		System.out.println(Celcius);

	}
}	 
