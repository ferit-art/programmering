import java.util.Scanner;

public class Uppgift_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Mata in ett värde till listan: ");
		int talArray_4 = input.nextInt();

		
		
		
		int[] talArray = { 56, 12, 11, 25, talArray_4};
		
		System.out.println("Mata in ett index (position): ");
		int index = input.nextInt();
		
		System.out.println(talArray[index]);

		if (talArray[1] < talArray[0]) {

			int temp = talArray[0];
			int temp_1 = talArray[1];

			talArray[0] = temp_1;
			talArray[1] = temp;
		}

		if (talArray[2] < talArray[1]) {

			int temp_2 = talArray[1];
			int temp_3 = talArray[2];

			talArray[1] = temp_3;
			talArray[2] = temp_2;
		}

		System.out.println(talArray[0] + ", " + talArray[1] + ", " + talArray[2] + ", " + talArray[3] + ", " + talArray[4]);
		
		input.close();
	}
}
