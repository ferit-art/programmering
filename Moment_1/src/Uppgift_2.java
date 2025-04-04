import java.util.Scanner; 

public class Uppgift_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in rektangelns bredd:");
		int Bredden = input.nextInt();

		System.out.println("Skriv in rektangelns längd:");
		int Längden = input.nextInt();

		int Arean = Bredden * Längden;

		System.out.println(Arean);

	}
}	 

