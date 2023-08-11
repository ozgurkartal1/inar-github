package week_02.assignments;

import java.util.Scanner;

public class Question_02_09 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1 and t : ");
        double startingVelocity = input.nextDouble();
        double endingVelocity = input.nextDouble();
        double time = input.nextDouble();

        double averageAcceleration = (endingVelocity - startingVelocity) / time;

        System.out.println("The average acceleration is " + averageAcceleration);
    }
}
