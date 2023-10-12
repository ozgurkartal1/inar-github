package src.week_07.assignment;

public class Question_07_24 {
    public static void main(String[] args) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        shufflingDeck(deck);

        int[] picks = new int[4];
        int count = 0;

        for (int i = 0 ; i < picks.length ; i++){
            int index = (int)(Math.random() * 52);

            if(isValidIndex(i, index, deck, picks)){
                picks[i] = index;
            }else{
                i--;
            }

            count++;
        }

        for (int i : picks) {
            System.out.println(ranks[deck[i] % 13] + " of " + suits[deck[i] / 13]);
        }

        System.out.println("Number of picks : " + count);


    }
    public static boolean isValidIndex(int i ,int index, int[] deck, int[] picks) {
        for (int j = 0; j < i; j++) {
            if(deck[index] / 13 == deck[picks[j]] / 13){
                return false;
            }
        }

        return true;
    }


    public static void shufflingDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * 52);

            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }
}