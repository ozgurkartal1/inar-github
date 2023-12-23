package src.week_12.assignment.question_12_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_23 {

    public static void main(String[] args) throws FileNotFoundException {

        String[] rank = {"assistant", "associate", "full"};

        File file = new File("C:\\Users\\PC\\IdeaProjects\\inar-java\\src" +
                "\\src\\week_12\\assignment\\question_12_23\\salary.txt");

        if(file.exists()){
            System.out.println(file + " is already exist");
            System.exit(1);
        }

        try(
                PrintWriter output = new PrintWriter(file)
        ){
            for (int i = 0; i < 1000; i++) {
                String FirstName = "FirstName" + (i + 1);
                String LastName = "LastName" + (i + 1);

                int index = (int)(Math.random() * rank.length);
                double salary = 0;

                switch (index){
                    case 0 -> salary =  (Math.random() * 30000) + 50000;
                    case 1 -> salary =  (Math.random() * 50000) + 60000;
                    case 2 -> salary =  (Math.random() * 55000) + 75000;
                }

                output.printf("%s %s %s %.2f\n", FirstName, LastName, rank[index], salary);
            }
        }


    }
}
