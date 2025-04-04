
public class Uppgift_2 {

	public static void main(String[] args) {

		int[] talArray = { 56, 12, 11, 25};

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

		System.out.println(talArray[0] + ", " + talArray[1] + ", " + talArray[2] + ", " + talArray[3]);

	}
}
