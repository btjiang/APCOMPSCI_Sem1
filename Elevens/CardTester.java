/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		Card card1 = new Card("ace", "hearts", 5) ;
		Card card2 = new Card("four", "clubs", 10);
		Card card3 = new Card("king", "jacks", 7);
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}
}
