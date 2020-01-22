/*
 * Name : Sangeetha Pattara
 * Student Number : 991578554
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

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
        Card luckyCard =new Card();
        
        //to print the 7 cards
        System.out.println("The hand of 7 Cards");
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             c.setValue((int) Math.floor(Math.random()*13)+1);
             c.setSuit(Card.SUITS[(int) Math.floor(Math.random()*4)]);
             System.out.println(c.getValue() + " " + c.getSuit());
             magicHand[i]=c;
        }
        
        //to pick the Lucky card
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick the Lucky card\nEnter the value - 1 to 13");
        luckyCard.setValue(sc.nextInt());  
        System.out.println("Enter the suit(Hearts, Diamonds, Spade, Clubs");
        sc.nextLine();
        luckyCard.setSuit(sc.nextLine());  
        
        //to print the Lucky Card
        System.out.println(luckyCard);
       
        boolean cardPresent = false;
        
       // to check  if the Lucky card is in the hand
        for (int i=0; i<magicHand.length; i++){
            if(magicHand[i].getValue()==luckyCard.getValue() && 
            magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()) ){
            cardPresent = true;
            break;
            }  
        
        } 
       if(cardPresent == true)
       System.out.println("The Lucky card is in the hand ");
       else
       System.out.println("The Lucky card is not in the hand ");
           
    }
    
}
