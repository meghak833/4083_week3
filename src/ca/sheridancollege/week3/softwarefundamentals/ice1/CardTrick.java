/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel modifier Russell Tan - 991586877
 */
public class CardTrick {

    private static Random value = new Random();
    private static Random suits = new Random();

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(value());
            // c.setSuit(Card.SUITS[suit()]);

        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

    public static int value() {
        int val = value.nextInt(13) + 1;
        return val;
    }

    public static int suit() {
        int sui = suits.nextInt(4);
        return sui;
    }

}
