package uppgift_3;

public class uppgift_3_personTest {
	public static void main(String[] args){

		uppgift_3 person1 = new uppgift_3();
		uppgift_3 person2 = new uppgift_3();

		person1.name = "Olle";
		person1.ssn = "8501234567";
		person1.phone = "0701234567";
		
		person2.name = "Alex";
		person2.ssn = "8501234567";
		person2.phone = "0701234567";

		person1.printInfo();
		person2.printInfo();
	}
}


