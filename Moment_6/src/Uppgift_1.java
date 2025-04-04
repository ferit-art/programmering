import java.util.Scanner;

public class Uppgift_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mata in ett tal:");
		double a = input.nextDouble();
		double root = Math.sqrt(a);
		
		System.out.println("Roten ur " + a + " är " + root);
		
		input.close();
	}
}
