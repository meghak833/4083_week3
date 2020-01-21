/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
       
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int randomCardValue = CardTrick.getRandomCard();
            c.setValue(randomCardValue);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomSuitValue = CardTrick.getRandomSuits();
            String suitValue;
            if(randomSuitValue == 0){
                suitValue = "Hearts";
            }
            else if(randomSuitValue == 1){
                suitValue = "Diamonds";
            }
            else if(randomSuitValue == 2){
                suitValue = "Spades";
            }
            else if(randomSuitValue == 3){
                suitValue = "Clubs";
            }
            c.setSuit(Card.SUITS[randomSuitValue]);
            System.out.println(randomCardValue + " " + randomSuitValue);
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        //Then report the result here
        
    }
    public static int getRandomCard(){
        int randomNumber;
        randomNumber = (int)( Math.random() * 13) + 1;
        return randomNumber;
    }
    public static int getRandomSuits(){
        int randomNumber ;
        randomNumber = (int)( Math.random() * 4) ;
        return randomNumber;
    }
    
}
