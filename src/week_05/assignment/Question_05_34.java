package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int countOfUser = 0;
        int countOfComputer = 0;

        String usersOption = "";
        String computersOption = "";

        do{

            byte optionOfComputer = (byte)(Math.random() * 3);

            System.out.print("scissor(0), rock(1), paper(2) : ");
            byte optionOfUser = input.nextByte();

            switch (optionOfUser){
                case 0 -> usersOption = "Scissor";
                case 1 -> usersOption = "Rock";
                case 2 -> usersOption = "Paper";
            }

            switch (optionOfComputer){
                case 0 -> computersOption = "Scissor";
                case 1 -> computersOption = "Rock";
                case 2 -> computersOption = "Paper";
            }

            if(optionOfUser == optionOfComputer){
                System.out.println("The computer is " + computersOption + ". You are " + usersOption + ". It is a draw\n" +
                        "Computer wins : " + countOfComputer + "\nUser wins : " + countOfUser);
            }else if(optionOfUser == 0 && optionOfComputer == 2 ||
                     optionOfUser == 1 && optionOfComputer == 0 ||
                     optionOfUser == 2 && optionOfComputer == 1){

                countOfUser++;

                System.out.println("The computer is " + computersOption + ". You are " + usersOption + ". You won\n" +
                        "Computer wins : " + countOfComputer + "\nUser wins : " + countOfUser);
            }else{
                countOfComputer++;

                System.out.println("The computer is " + computersOption + ". You are " + usersOption + ". Computer won\n" +
                        "Computer wins : " + countOfComputer + "\nUser wins : " + countOfUser);
            }
        }while(Math.abs(countOfUser - countOfComputer) < 3);

    }
}
