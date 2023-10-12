package src.week_07.live_class;

import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int[] deck = shufflingDeck();

        printCardsOfDeck(deck, suits, ranks, 4);

    }



    public static void printCardsOfDeck(int[] deck, String[] suits, String[] ranks, int n){
        for (int i = 0; i < n; i++) {

            System.out.println((i + 1) + ". card : " + deck[i] + " : "
                    + suits[deck[i] / 13] + " of " + ranks[deck[i] % 13]);
        }


    }

    private static int[] shufflingDeck() {
        int[] deck = getDeck();
        for (int i = 0; i < deck.length; i++) {
            int j = (int)(Math.random() * deck.length);

            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        return deck;
    }

    private static int[] getDeck() {
        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }
}
