/*
 * Modified by: Andres Munevar
 * Student ID: 991568888
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
           Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int randomCardNum = (int)(ceil(random()*13));
            c.setValue(randomCardNum);
            magicHand[i] = c;        
            //setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomNum = (int)(floor(random()*4));
            c.setSuit(Card.SUITS[randomNum]);
            switch (randomNum) {
                case 0:
                    System.out.println("You got " + c.getValue + " of Hearths");
                    break;
                case 1:
                    System.out.println("You got " + c.getValue + "Diamonds");
                    break;
                case 2:
                    System.out.println("You got " + c.getValue + "Spades");
                    break;
                default:
                    System.out.println("You got " + c.getValue + "Clubs");
                    break;
            }
           
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        //Then report the result here
    }
    
}
