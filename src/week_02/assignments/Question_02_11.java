package week_02.assignments;

import java.util.Scanner;

public class Question_02_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double birthInOneYear = (365 * 24 * 60 * 60) / 7.0;
        final double deathInOneYear = (365 * 24 * 60 * 60) / 13.0;
        final double immigrantInOneYear = (365 * 24 * 60 * 60) / 45.0;

        int currentPopulation = 312032486;

        System.out.print("Enter the number of years : ");
        int numberOfYears = input.nextInt();

        currentPopulation = (int)(currentPopulation + 5 * (birthInOneYear + immigrantInOneYear - deathInOneYear));

        System.out.println("The population in " + numberOfYears + " years is " + currentPopulation);
    }
}
