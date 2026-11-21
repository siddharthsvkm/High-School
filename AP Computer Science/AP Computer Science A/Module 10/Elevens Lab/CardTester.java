/**
 * This is a class that tests the Card class.
 *
 *  Siddharth Sivakumar
 *  February 2025
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card card1 = new Card("ace", "hearts", 1);
      Card card2 = new Card("ace", "hearts", 1);
      Card card3 = new Card("ace", "spades", 1);

      // Test card 1 and methods
      int cardNum;
      String rank, suit;
      
      cardNum = 1;
      rank = "ace";
      suit = "hearts";
      System.out.println(" **** Tests Card " + cardNum + ": " + rank + " of " + suit + " ****");
      System.out.println("   rank: " + card1.rank());
      System.out.println("   suit: " + card1.suit());
      System.out.println("   pointValue: " + card1.pointValue());
      System.out.println("   toString: " + card1.toString());
      System.out.println();

      // Test card 2
      cardNum = 2;
      rank = "ace";
      suit = "hearts";
      System.out.println(" **** Tests Card " + cardNum + ": " + rank + " of " + suit + " ****");
      System.out.println("   rank: " + card2.rank());
      System.out.println("   suit: " + card2.suit());
      System.out.println("   pointValue: " + card2.pointValue());
      System.out.println("   toString: " + card2.toString());
      System.out.println();
      // Test card 3
      cardNum = 3;
      rank = "ace";
      suit = "spades";
      System.out.println(" **** Tests Card " + cardNum + ": " + rank + " of " + suit + " ****");
      System.out.println("   rank: " + card3.rank());
      System.out.println("   suit: " + card3.suit());
      System.out.println("   pointValue: " + card3.pointValue());
      System.out.println("   toString: " + card3.toString());
      System.out.println();
      
      // Test matches() method
      System.out.println(" **** matches Tests ****");
      System.out.println("   Card 1 matches Card 2: " + card1.matches(card2));
      System.out.println("   Card 1 matches Card 3: " + card1.matches(card3));
   }
}
