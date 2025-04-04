public class Uppgift_9 {

	// Metoden sorterar och flyttar på värdena 
	public static void sortArray(int[] array) {
		for (int position = 0; position < array.length-1; position++) {
			int posMin = position;
			for (int i = position + 1; i < array.length; i++) {
				if (array[i] < array[posMin]) {
					posMin = i;
				}
			}
			swap(array, position, posMin);
		}
	}

	// Metoden byter platsen på värdena 
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// Metoden skriver ut array:en
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] array = {4, 115, 12, 22, 1};
		
		System.out.print("Osorterad array: ");
		printArray(array);
		sortArray(array);

		System.out.print("Sorterad array: ");
		printArray(array);
	}
}
