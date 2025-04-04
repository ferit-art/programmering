import java.util.Scanner;

public class Uppgift_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] talArray = new double[4];

		System.out.println("Mata in 4:a flyttal");
		talArray[0] = input.nextDouble();
		talArray[1] = input.nextDouble();
		talArray[2] = input.nextDouble();
		talArray[3] = input.nextDouble();

		System.out.println("Talen i vår array: " + talArray[3] +"  "+ talArray[2] +"  "+ talArray[1] +"  "+ talArray[0]);
		
		input.close();
	}
}
