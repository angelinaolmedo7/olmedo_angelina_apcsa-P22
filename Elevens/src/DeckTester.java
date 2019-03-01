/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck cardDeck = new Deck (new String[] {"Dog", "Cat"}, new String[] {"Earth","Air","Fire","Water"}, new int[] {1,2});
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck.size());
		System.out.println(cardDeck.deal());
	
	}
}
