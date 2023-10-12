package src.week_07.assignment;

public class Question_07_29 {

    public static void main(String[] args) {

        int[] deck = new int[52];

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        shufflingDeck(deck);
        int sum;
        int[] pickingCards;
        int count = 0;

        do{
            pickingCards = new int[4];

            for (int i = 0; i < pickingCards.length; i++) {
                pickingCards[i] = pickCard(deck);
            }

            sum = sum(pickingCards);

            count++;

        }while(sum != 24);

        System.out.println("The number of picks that yields the sum of 24 : " + count);
        System.out.print("The picks are : ");

        for (int i : pickingCards) {
            System.out.print(ranks[i - 1] + " ");
        }


    }

    private static int sum(int[] pickingCards) {
        int sum = 0;

        for (int i : pickingCards) {
            sum += i;
        }

        return sum;
    }

    public static int pickCard(int[] deck) {
        int index = (int)(Math.random() * 52);

        return deck[index] % 13 + 1;
    }

    public static void shufflingDeck(int[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int number = deck[i];
            int index = (int)(Math.random() * 52);

            deck[i] = deck[index];
            deck[index] = number;
        }
    }
}
