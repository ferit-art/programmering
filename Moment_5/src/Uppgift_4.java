import java.util.Scanner;

public class Uppgift_4 {
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
			
			System.out.print("\nVill du fortsätta (j/n)? Antal: " + y);
			choise = input.next().charAt(0);
			
		}while(choise == 'j' || choise == 'J');
		input.close();
	}
}
