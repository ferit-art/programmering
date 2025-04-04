import java.util.Scanner;

public class Uppgift_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choise;

		int[] array = new int[100];
		int i = 0;
		double y = 0;

		System.out.println("Mata in ett antal heltal:");

		do{
			System.out.print("Tal[" + (i+1) + "] : ");
			array[i] = input.nextInt();
			i++;
			y++;
			
			System.out.print("\nVill du fortsätta (j/n)? ");
			choise = input.next().charAt(0);
		}while(choise == 'j' || choise == 'J');

		do{
			System.out.println("VÄLJ ETT ALTRNATIV");
			System.out.println("[1] Mata in nytt tal");
			System.out.println("[2] Beräkna medelvärdet av talen");
			System.out.println("[3] Beräkna variationsbredden");
			System.out.println("[4] Avsluta");

			choise = (char) input.nextInt();

			switch(choise){
			case 1: 
				do{
					System.out.print("Tal[" + (i+1) + "] : ");
					array[i] = input.nextInt();
					i++;
					y++;
					
					System.out.print("\nVill du fortsätta (j/n)? ");
					choise = input.next().charAt(0);
				}while(choise == 'j' || choise == 'J');

				break;
			case 2: 

				double summa = 0;
				double mvarde = 0;

				for(i = 0; i < y; i++) {
					summa = array[i] + summa;
				}

				mvarde = summa / y;
				System.out.println("Medelvärdet:" + mvarde);

				break;
			case 3: 

				int min = array[0];

				for (i = 1; i < y; i++) {
					if (array[i] < min) {
						min = array[i];
					}
				}
				
				int max = array[0];

				for (i = 1; i < y; i++) {
					if (array[i] > max) {
						max = array[i];
					}
				}
				
				int vbredd = max - min;
				
				System.out.println("Variationsbredden är: " + vbredd);
				break;
			case 4: 
				break;
			default:
				System.out.println("Felaktigt val("+ choise + ")!");
			}

		}while(choise != 4);
		input.close();
	}	
}

