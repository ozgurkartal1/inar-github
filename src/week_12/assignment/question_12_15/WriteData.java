package src.week_12.assignment.question_12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\inar-java" +
                "\\src\\src\\week_12\\assignment\\question_12_15\\number.txt");


        if(file.exists()){
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 99) + 1;
            output.print(number + " ");
        }


        output.close();
    }
}
