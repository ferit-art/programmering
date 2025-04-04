
public class Uppgift_7 {
	public static int min(int numbers[]) {
		int min = numbers[0];

		for (int y = 1; y < numbers.length; y++) {
			if (numbers[y] < min) {
				min = numbers[y];
			}
		}
		return min;
	}

	public static int max(int numbers[]) {
		int max = numbers[0];
		int y = 0;
		for (int i = 1; i < y; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
}


