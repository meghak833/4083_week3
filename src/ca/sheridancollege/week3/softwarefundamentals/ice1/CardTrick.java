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
 * @modifier Aida Bizhanova
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
 
        
        for (int i=0; i<magicHand.length; i++)
        {
            
            Card c = new Card();
            
            c.setValue((int)(1+(Math.random()*13)));
            c.setSuit(Card.SUITS[(int)((Math.random()*4))]);
            
            magicHand[i]=c;
            
            System.out.println("The Card in Magic hand is " + magicHand[i].getValue()+" "+magicHand[i].getSuit());
        }
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Pick a suit");
        String val = scan.nextLine();
        
        
        
        Card myCard = new Card();
        myCard.setSuit(val);
        myCard.setValue(num);
        
        System.out.println("My Card is " + myCard.getSuit()+" "+myCard.getValue());
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        //Then report the result here
    }
    
    
}
