package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int numberOfStudent = input.nextInt();

        System.out.print("Enter " + numberOfStudent + " scores : ");

        int[] notes = new int[numberOfStudent];

        for (int i = 0; i < notes.length; i++) {
            notes[i] = input.nextInt();
        }

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Student " + i + " score is " + notes[i] +
                    " and grade is " + getNotes(notes, notes[i]));
        }
    }

    public static char getNotes(int[] notes, int note) {
        int bestNote = getBestNote(notes);
        char letter = ' ';


        if(note >= bestNote - 10){
               letter = 'A';}
        else if(note >= bestNote - 20){
               letter = 'B';
        }

        else if(note >= bestNote - 30){
               letter = 'C';
        }

        else if(note >= bestNote - 40){
               letter = 'D';
        }

        else{
               letter = 'F';
        }

       return letter;
    }

    public static int getBestNote(int[] notes) {
        int max = notes[0];

        for(int i : notes){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
