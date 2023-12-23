package src.week_12.assignment.question_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_21 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\inar-java\\src\\src\\week_12" +
                "\\assignment\\question_12_21\\example.txt");

        if(!file.exists()){
            System.out.print("This file does not exist.");
            System.exit(1);
        }

        ArrayList<String> list = new ArrayList<>();

       try (Scanner input = new Scanner(file)){
           while (input.hasNext()){
               list.add(input.nextLine());
           }
       }

       ArrayList<String> temp = (ArrayList<String>) list.clone();
       Collections.sort(list);
       ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(!temp.get(i).equals(list.get(i))){
                list1.add(i);
            }

            if(list1.size() == 2){
                break;
            }
        }

        System.out.println("The strings " + list1.get(0) + " and " +
                list1.get(1) + " are out of order");


    }
}
