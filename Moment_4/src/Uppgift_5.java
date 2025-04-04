import java.util.Scanner;

public class Uppgift_5 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] numbers = new int[4];

		System.out.println("Mata in 4 tal:");
		numbers[0] = input.nextInt();
		numbers[1] = input.nextInt();
		numbers[2] = input.nextInt();
		numbers[3] = input.nextInt();

		input.close();

		if (numbers[0] > numbers[1]) {
			int temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
		}
		if (numbers[1] > numbers[2]) {
			int temp = numbers[1];
			numbers[1] = numbers[2];
			numbers[2] = temp;
		}
		if (numbers[2] > numbers[3]) {
			int temp = numbers[2];
			numbers[2] = numbers[3];
			numbers[3] = temp;
		}
		if (numbers[0] > numbers[1]) {
			int temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
		}
		if (numbers[1] > numbers[2]) {
			int temp = numbers[1];
			numbers[1] = numbers[2];
			numbers[2] = temp;
		}
		if (numbers[0] > numbers[1]) {
			int temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
		}

		System.out.println("Sorterad array: [" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + "]");

	}
}
