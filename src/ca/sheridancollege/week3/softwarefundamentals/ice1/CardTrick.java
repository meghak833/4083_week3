/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
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
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random rand = new Random();
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            magicHand[i] = c;
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        Scanner input = new Scanner(System.in);
        //insert code to ask the user for Card value and  or Hard code it, create their card
        System.out.println("Enter your card value and suit.");
        System.out.println("Value: ");
        int cardNum = input.nextInt();
        System.out.println("Suit: ");
        String suit = input.nextLine();
        boolean doesExist = false;
        
            for (int i=0; i<magicHand.length; i++)
            {
                if(magicHand[i].getValue() == cardNum && 
                   magicHand[i].getSuit() == suit) 
                {
                    doesExist = true;
                }
            }
        
        //Then report the result here
        if(doesExist) 
        {
            System.out.println("Your card exists in the hand.");
        }
        
        else 
        {
            System.out.println("Your card does not exist in the hand.");
        }
    }   
}