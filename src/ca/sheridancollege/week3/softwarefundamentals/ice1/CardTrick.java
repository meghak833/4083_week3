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
 * @author Shankar Ghimire
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scanner = new Scanner(System.in);
       
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //code to generate random number for card value
            //c.setValue(insert call to random number generator here)
            int randomCardValue = (int)( Math.random() * 13) + 1;
            c.setValue(randomCardValue);
            
            //code to generate random number for card suits
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomSuitValue = (int)( Math.random() * 4);
            if(randomSuitValue == 0){             
                c.setSuit(Card.SUITS[0]);
            }
            else if(randomSuitValue == 1){
                c.setSuit(Card.SUITS[1]);
            }
            else if(randomSuitValue == 2){
                c.setSuit(Card.SUITS[2]);
            }
            else if(randomSuitValue == 3){
                c.setSuit(Card.SUITS[3]);
            }
            magicHand[i] = c;
        }
        //Code to print the 7 deck of randomly generated cards
        System.out.println("Suit - Value");
        System.out.println("------------------");
        for(int i = 0; i< magicHand.length; i++){
            System.out.println(magicHand[i].getSuit() +" - " + Card.CARD_VALUES[magicHand[i].getValue()] );
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        Card userLuckyCard = new Card();
        //Code to input user's lucky card suit 
        System.out.println("Inpur your lucky card suit : " + 
                "\n 0 for Hearts \n 1 for Diamonds \n 2 for Spades \n 3 for Clubs");
        int userLuckyCardSuit = scanner.nextInt();
        while(userLuckyCardSuit < 0 || userLuckyCardSuit > 3){
            System.out.println("Wrong value!!! \nInpur your lucky card suit : " + 
                "\n 0 for Hearts \n 1 for Diamonds \n 2 for Spades \n 3 for Clubs");
                userLuckyCardSuit = scanner.nextInt();
                
        }
        userLuckyCard.setSuit(Card.SUITS[userLuckyCardSuit]);
        
        //code to input user's lucky card value
        System.out.println("Inpur your lucky card value between 1 - 13 : "); 
        int userLuckyCardValue = scanner.nextInt();
        while(userLuckyCardValue < 1 || userLuckyCardValue > 13){
            System.out.println("Wrong value!!! \nInpur your lucky card value between 0 - 13 : ");
                userLuckyCardValue = scanner.nextInt();         
        }
        
        //set card suits and card value to the card object using setter method
        userLuckyCard.setSuit(Card.SUITS[userLuckyCardSuit]);
        userLuckyCard.setValue(userLuckyCardValue);
            
        //Then report the result here
         //print user's lucky card 
        System.out.println("User's Lucky Card is : "+Card.CARD_VALUES[userLuckyCard.getValue()]  + " of " + userLuckyCard.getSuit());
        
        
    }

    
}
