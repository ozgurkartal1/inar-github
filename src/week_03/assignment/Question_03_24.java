package week_03.assignment;

import java.util.Scanner;

public class Question_03_24 {

    public static void main(String[] args) {

        int random = (int)(Math.random() * 52) ;

        int rankOfCard = random % 13;
        int suitOfCard = random / 13;

        switch (rankOfCard){
            case 0 -> System.out.print("The card you picked is King(0) of ");
            case 1 -> System.out.print("The card you picked is Ace(1) of ");
            case 2 -> System.out.print("The card you picked is 2 of ");
            case 3 -> System.out.print("The card you picked is 3 of ");
            case 4 -> System.out.print("The card you picked is 4 of ");
            case 5 -> System.out.print("The card you picked is 5 of ");
            case 6 -> System.out.print("The card you picked is 6 of ");
            case 7 -> System.out.print("The card you picked is 7 of ");
            case 8 -> System.out.print("The card you picked is 8 of ");
            case 9 -> System.out.print("The card you picked is 9 of ");
            case 10 -> System.out.print("The card you picked is 10 of ");
            case 11 -> System.out.print("The card you picked is Jack(11) of ");
            case 12 -> System.out.print("The card you picked is Queen(12) of ");
        }
        switch (suitOfCard){
            case 0 -> System.out.println("Clubs");
            case 1 -> System.out.println("Diamonds");
            case 2 -> System.out.println("Hearts");
            case 3 -> System.out.println("Spades");
        }
    }
}
