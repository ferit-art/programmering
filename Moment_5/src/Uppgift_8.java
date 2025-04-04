import java.util.Scanner;

public class Uppgift_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Mata in höjden till triangeln:");
		
		int höjd = input.nextInt();
		String stjärnor = "";
		
		for (int i = 0; i < höjd; i++) {
			
			stjärnor = stjärnor + "*";
			System.out.println(stjärnor);
		}
		input.close();
	}
}
