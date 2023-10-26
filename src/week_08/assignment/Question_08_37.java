package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] array = {{"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}};

        int correctCount = 0;

        for (String[] strings : array) {


            System.out.print("What is capital of the " + strings[0] + "?");
            String answer = input.nextLine();

            if (strings[1].equals(answer)) {
                correctCount++;
                System.out.println("Your answer is correct");
            } else {
                System.out.println("The correct answer should be " + strings[1]);
            }

        }

        System.out.println("The correct count is " + correctCount);


    }
}
