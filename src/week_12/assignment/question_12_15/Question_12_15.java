package src.week_12.assignment.question_12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_15 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\inar-java" +
                "\\src\\src\\week_12\\assignment\\question_12_15\\number.txt");


        if(!file.exists()){
            System.out.println("This file does not exist");
            System.exit(2);
        }

        ArrayList<Integer> list = new ArrayList<>();

        try(Scanner input = new Scanner(file)) {

            while (input.hasNext()){
                list.add(input.nextInt());
            }

        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%2d ", list.get(i));

            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }


    }
}
