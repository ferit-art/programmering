import java.util.Scanner;

public class Uppgift_6 {

	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" Skriv ett svenskt ord som ska översättas till engelska: ");

		String svenska_ordet = input.next();

		switch(svenska_ordet){
		case "Hund":
			System.out.println(" Dog ");
			break;
		case "Apa":
			System.out.println(" Monkey ");
			break;
		case "Zebra":
			System.out.println(" Zebra ");
			break;
		case "Häst":
			System.out.println(" Horse ");
			break;
		case "Myra":
			System.out.println(" Ant ");
			break;
		default: 
			System.out.println(" Ordet fanns inte i lexikonet :( ");
		}
	}
}
