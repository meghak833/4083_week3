/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifer Venkatesh Sritharan
 * ID: 991558184
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            
            //random number from 1 to 13
            Random rand = new Random();
            int value = rand.nextInt((13 - 1) + 1) + 1;
            
            c.setValue(value);
            //c.setValue(insert call to random number generator here)
            int suitNo = rand.nextInt((3 - 0) + 1) + 0;
            c.setSuit(Card.SUITS[suitNo]);
            
            //printing suit and value of card
             System.out.println(c.getSuit() + " " + c.getValue());
         
 
        
        
        //Then report the result here
    }
    
}
