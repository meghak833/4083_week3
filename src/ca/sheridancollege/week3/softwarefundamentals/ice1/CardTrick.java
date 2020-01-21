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
 * @author Megha Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String card = null;
 
        
        for (int i=0; i<magicHand.length; i++)
        {
            int a = 1 + (int)(Math.random() * 4);  
        if(a==1)
            card="Hearts";
        else if (a==2)
            card="Diamonds";
        else if (a==3)
            card="Spades";
        else if (a==4)
            card="Clubs";
        int b = 1 + (int)(Math.random() * 13);
        
            Card c = new Card();
            String[] cardNum= new String[7];
            int[] cardVal= new int[7];
            cardNum[i]=card;
            cardVal[i]=b;
            System.out.println("Your Card is: "+cardNum[i]+" "+cardVal[i]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        //Then report the result here
    }
    
}
