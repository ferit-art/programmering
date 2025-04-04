public class Uppgift_4 {
	public class Main {
		public static void main(String[] args) {
			String txt = "Jag heter Olle";

			String[] words = txt.split(" ");
			
			for(int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
			}
			
			for (String word : words) {
				System.out.println(word);
			}

			String subString1 = txt.substring(11, 14); 
			System.out.println(subString1);

			String subString2 = txt.substring(5, 10); 
			System.out.println(subString2);
		}
	}
}
