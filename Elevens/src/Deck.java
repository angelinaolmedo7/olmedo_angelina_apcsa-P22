import java.util.List;
import java.util.ArrayList;


public class Deck {

	//private List<Card> cards;
	private Card[] cards;
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new Card[ranks.length*suits.length];
		size = cards.length;
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
		return (size==0);
	}

	public int getSize() {
		return size;
	}
	
	public void setSize(int newSize) {
		size = newSize;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		Card crd;
		for (int k = cards.length-1; k>=0; k--) {
			int r = (int)(Math.random() * k + 1); 
			crd=cards[k];
			cards[k]=cards[r];
			cards[r]=crd;
		}
		size=cards.length;
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
			setSize(size-1);
			return new Card(cards[size].rank(),cards[size].suit(),cards[size].pointValue());
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

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
		for (int k = cards.length-1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - size) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
