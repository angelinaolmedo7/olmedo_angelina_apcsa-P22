/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	//instance variables
	private String rank;
	private String suit;
	private int pointValue;

	//constructors
	public Card() {
		setInfo ("Ace", "Spades", 1);
	}
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		setInfo (cardRank, cardSuit, cardPointValue);
	}
	
	//setters
	public void setInfo (String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}
	
	//getters
	public String suit() {
		return suit;
   }
	public String rank() {
		return rank;
	}
	public int pointValue() {
		return pointValue;
	}

	//compare
	public boolean matches(Card otherCard) {
		return ( (rank.equals(otherCard.rank())) && (suit.equals(otherCard.suit)) && (pointValue == otherCard.pointValue()) );
	}

	//toString
	@Override
	public String toString() {
		return rank + " of "+suit+ " (point value = "+pointValue+")";
	}
}
