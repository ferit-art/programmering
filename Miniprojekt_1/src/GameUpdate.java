/**
 * GameUpdate
 * Klassen uppdaterar spelfigurernas läge
 * De olika metoderna anropas då en specifik tangent trycks ner.
 * 
 * Skriv koden för att få interaktivitet i spelet
 * 
 * @author Henrik Bygren
 * @since  2016-05-10
 * @see    GameUpdate
 *
 */
public class GameUpdate {
	// Koordinater för spelfigurerna
	int greenX = 450, greenY = 200;
	int greyX = 5, greyY = 200;
	
	/**
	 * Anropas då vänster piltangent trycks ner
	 */
	public void leftKey(){
		greenX = greenX - 1;
	}
	
	/**
	 * Anropas då höger piltangent trycks ner
	 */
	public void rightKey(){
		greenX = greenX + 1;
	}
	
	/**
	 * Anropas då upp piltangent trycks ner
	 */
	public void upKey(){
		greenY = greenY - 1;
	}
	
	/**
	 * Anropas då ner piltangent trycks ner
	 */
	public void downKey(){
		greenY = greenY + 1;
	}
	
	/**
	 * Anropas då A tangenten trycks ner
	 */
	public void aKey(){
		greyX = greyX - 1;
	}
	
	/**
	 * Anropas då D tangenten trycks ner
	 */
	public void dKey(){
		greyX = greyX + 1;
	}
	
	/**
	 * Anropas då W tangenten trycks ner
	 */
	public void wKey(){
		greyY = greyY - 1;
	}
	
	/**
	 * Anropas då S tangenten trycks ner
	 */
	public void sKey(){
		greyY = greyY + 1;
	}
}
