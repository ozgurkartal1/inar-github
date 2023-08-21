package week_03.live_class;

import java.util.Scanner;

public class Workspace05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tuition;

        System.out.print("Enter a boolean value -> ");
        boolean inState = input.nextBoolean();

        if(inState){
            tuition = 5000;
        } else{
            tuition = 15000;
        }

        System.out.println("The tuition is -> " + tuition);
    }
}
