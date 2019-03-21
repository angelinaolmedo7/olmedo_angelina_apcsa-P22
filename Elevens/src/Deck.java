import java.util.List;
import java.util.ArrayList;


public class Deck {

	private List<Card> cards;
	private List<Card> dealtCards=new ArrayList<Card>();
	//private Card[] cards;
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		size = cards.size();
		for (int i = 0; i<suits.length; i++) {
			for (int b = 0; b<ranks.length; b++) {
				cards.add(new Card(ranks[b],suits[i],values[b]));
			}
		}
		shuffle();
	}

	public boolean isEmpty() {
		return (cards.size()==0);
	}

	public int getSize() {
		return cards.size();
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
		for (int k = cards.size()-1; k>=0; k--) {
			int r = (int)(Math.random() * k + 1); 
			crd=cards.get(k);
			cards.set(k,cards.get(r));
			cards.set(r, crd);
		}
		size=cards.size();
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
			Card crd = cards.get(size-1);
			//System.out.println(crd);
			dealtCards.add(crd);
			cards.remove(size-1);
			size = cards.size();
			return crd;
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
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		
		rtn = rtn + "\nDealt cards: \n";
		for (int k = dealtCards.size()-1; k >= 0; k--) {
			rtn = rtn + dealtCards.get(k);
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
