/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card ("Seven", "Spades",7);
		Card two = new Card ("Seven", "Spades",7);
		Card three = new Card ("Eight", "Diamonds",8);
		
		System.out.println(one);
		System.out.println(two.suit());
		System.out.println(one.rank());
		System.out.println(three.pointValue());
		System.out.println(one.matches(two));
		System.out.println(two.matches(three));
	}
}
