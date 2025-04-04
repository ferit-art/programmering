import java.util.Scanner;

public class Uppgift_3 {
	public static double fahrenheitToCelsius(double F) {

		double C = F - 32;
		C = C / 1.8;
		return C;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Mata in temp i fahrenheit:");

		double fahrenheit = input.nextDouble();
		double celsius = fahrenheitToCelsius(fahrenheit);

		System.out.println("Temp i celsius: " + celsius);
		input.close();
	}
}