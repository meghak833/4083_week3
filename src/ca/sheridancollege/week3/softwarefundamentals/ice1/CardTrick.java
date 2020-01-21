/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Steven Michalec / 991 228 778
 */

import java.util.*;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        int max = 13;
        int upper = 4;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(max)+ 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(upper)]);
            
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card userCard = new Card();
        
        System.out.println("Enter an Card value: ");
        userCard.setValue(input.nextInt());
        input.nextLine();
        System.out.println("Enter a suit: ");
        userCard.setSuit(input.nextLine());
        
        System.out.println("You have picked the " + userCard.getValue() + " of "
                + userCard.getSuit());
        
    }
    
}
