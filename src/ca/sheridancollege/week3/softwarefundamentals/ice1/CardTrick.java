/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel modifier Russell Tan - 991586877
 */
public class CardTrick {

    private final Random VALUE = new Random();
    private final Random SUITS = new Random();

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        CardTrick cardValue = new CardTrick();
        CardTrick cardSuit = new CardTrick();

        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue(cardValue.value());
            magicHand[i].setSuit(Card.SUITS[cardSuit.suit()]);
        }
        Scanner pickValue = new Scanner(System.in);
        System.out.print("Pick a number: ");
        int numValue = pickValue.nextInt();

        Scanner pickSuit = new Scanner(System.in);
        System.out.print("Pick a suit: ");
        String suitValue = pickSuit.nextLine();
        System.out.println();

        for (int j = 0; j < magicHand.length; j++) {
            
            if (numValue == magicHand[j].getValue() && magicHand[j].getSuit().equals(suitValue)) {
                System.out.println("There is a match to your card");
                break; 
            }
        }
    }

    public int value() {
        int val = VALUE.nextInt(13) + 1;
        return val;
    }

    public int suit() {
        int sui = SUITS.nextInt(4);
        return sui;
    }

}
