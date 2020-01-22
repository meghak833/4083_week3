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
 * modified by Mukti Patel 
 * Student id:991555347
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        //Card[] magicHand = new Card[7];
        Card[] c=new Card[7];
        for (int i=0; i<c.length; i++)
        {
            
            c[i]=getCard();
            System.out.println(c[i].getSuit());
            System.out.println(c[i].getValue());
            
                    
        }
           Card manualHand=new Card("Diamonds",9);
           System.out.println("Lucky card:");
           System.out.println(manualHand.getSuit());
           System.out.println(manualHand.getValue());

        }
    public static Card getCard(){
        int value =((int)(Math.random()*13 + 1));
        String suit=(Card.SUITS[(int)(Math.random()* 4 + 0)]);
        return new Card(suit,value);
    }
           
    }
    

