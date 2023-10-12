package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");

        int year = input.nextInt();

        String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger",
         "Dragon", "Snake", "Horse", "Sheep"};

        System.out.println(year + " is a year of " + zodiac[year % 12] + " in zodiac");


    }
}
