package week_03.assignment;

import java.util.Scanner;

public class Question_03_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int random = (int)(Math.random() * 3);

        System.out.print("scissor(0), rock(1), paper(2) : ");
        int value = input.nextInt();

        switch (random){
            case 0 -> System.out.print("The computer is scissor. ");
            case 1 -> System.out.print("The computer is rock. ");
            case 2 -> System.out.print("The computer is paper. ");
        }
        switch (value){
            case 0 -> System.out.print("You are scissor. ");
            case 1 -> System.out.print("You are rock. ");
            case 2 -> System.out.print("You are paper. ");
        }

        if(random == value){
            System.out.println("It is a draw");
        }else if (value == 0 && random == 2 || value == 1 && random == 0 || value == 2 && random == 1){
            System.out.println("You won");
        }else{
            System.out.println("Computer won");
        }
    }
}
