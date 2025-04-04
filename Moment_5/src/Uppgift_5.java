import java.util.Scanner;

public class Uppgift_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choise;

		int[] array = new int[100];
		int i = 0;
		int y = 0;

		System.out.println("Mata in ett antal heltal");

		do{
			System.out.print("Tal[" + (i+1) + "] : ");
			array[i] = input.nextInt();
			i++;
			y++;

			System.out.print("\nVill du fortsätta (j/n)? ");
			choise = input.next().charAt(0);

		}while(choise == 'j' || choise == 'J');
		input.close();
		
		for(i = 0; i < y; i++) {
			System.out.println(array[i] + " ");
		}
		
		for(i = y-1; i >= 0; i--) {
			System.out.println(array[i] + " ");
		}
		
		for(i = 0; i < y; i++) {
			if (array[i] > 0) {
				System.out.println(array[i] + " ");
			}
		}
		
		for(i = 0; i < y; i+=2) {
			System.out.println(array[i] + " ");
		}
	}
}