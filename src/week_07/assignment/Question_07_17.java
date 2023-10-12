package src.week_07.assignment;

import java.util.Scanner;

public class Question_07_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();

        int[] listOfScore = new int[numberOfStudents];
        String[] listOfName = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String name = input.next();

            listOfName[i] = name;

            System.out.print("Score : ");
            int score = input.nextInt();

            listOfScore[i] = score;
        }

        sortNameList(listOfScore, listOfName);

        for (String s : listOfName) {
            System.out.println(s);
        }


    }

    public static void sortNameList(int[] listOfScore, String[] listOfName) {
        int high = listOfScore.length - 1;
        int low = 0;



        while(high > low){
            int max = listOfScore[low];
            int index = low;

            for (int i = low + 1 ; i < high ; i++){
                if(listOfScore[i] > max){
                    max = listOfScore[i];
                    index = i;
                }
            }

            int temp = listOfScore[low];
            listOfScore[low] = listOfScore[index];
            listOfScore[index] = temp;

            String temp1 = listOfName[low];
            listOfName[low] = listOfName[index];
            listOfName[index] = temp1;

            low++;

        }
    }
}
