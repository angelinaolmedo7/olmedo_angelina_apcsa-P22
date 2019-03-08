/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck cardDeck = new Deck (new String[] {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Jack","Queen","King"}, new String[] {"Diamonds","Spades","Clubs","Hearts"}, new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13});
		//System.out.println(cardDeck.getSize());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck);
		//System.out.println(cardDeck.getSize());
		System.out.println(cardDeck.deal());
		System.out.println(cardDeck);
	
	}
}
