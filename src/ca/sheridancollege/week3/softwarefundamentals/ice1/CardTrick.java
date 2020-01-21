/*
Sudesh Sunichura 
991421780
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sudesh Sunichura
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)( Math.floor(Math.random() * 13)));
            int a;
            a = (int) (Math.floor(Math.random() * 3));
            if (a == 0) {
                c.setSuit("Hearts");
            } else if (a == 1) {
                c.setSuit("Diamonds");
            } else if (a == 2) {
                c.setSuit("Spades");
            } else if (a == 3) {
                c.setSuit("Clubs");
            }
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        //Then report the result here
    }
    
}
