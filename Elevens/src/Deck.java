import java.util.List;
import java.util.ArrayList;


public class Deck {

	//private List<Card> cards;
	private Card[] cards;
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new Card[ranks.length*suits.length];
		int ind = 0;
		for (int i = 0; i<suits.length; i++) {
			for (int b = 0; b<ranks.length; b++) {
				cards[ind] = new Card(ranks[b],suits[i],values[b]);
				ind++;
			}
		}
		shuffle();
	}

	public boolean isEmpty() {
		return (size()==0);
	}

	public int size() {
		int count = 0;
		for (int i = 0; i< cards.length; i++) {
			if (!cards[i].suit().equals("Empty")){
				count++;
			}
		}
		return count;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		else {
			Card ret = new Card(cards[size()-1].rank(),cards[size()-1].suit(),cards[size()-1].pointValue());
			cards[size()-1] = new Card("Empty","Empty",0);
			return ret;
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size() + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		
		rtn = rtn + "\nDealt cards: \n";
		for (int k = size() - 1; k >= size(); k--) {
			rtn = rtn + cards[k];
			if (k != size()) {
				rtn = rtn + ", ";
			}
			if ((k - size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
