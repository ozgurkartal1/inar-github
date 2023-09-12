package src.week_05.live_class;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();

        s = s.trim();
        int count = 0;

        // ALİ   ATA    BAK


        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ' || !Character.isLetter(s.charAt(i + 1))){
                continue;
            }
            count++;
        }
        System.out.println(count + 1);
    }
}
