/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @version2 Nabil Remedan 991584585
 * @modifier Nabil Remedan
 * @date January 21, 2020
 * @author Megha Patel
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();

        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue((int) (Math.random() * 13) + 1);
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 3) + 1]);
        }
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(magicHand[i]);
        }

        System.out.println("Pick a Suite");
        Scanner scanner = new Scanner(System.in);
        String suite = scanner.nextLine();

        System.out.println("Pick a Number(1-13)");
        int number = scanner.nextInt();

        luckyCard.setSuit(suite);
        luckyCard.setValue(number);

        System.out.println(luckyCard);
    }

}
