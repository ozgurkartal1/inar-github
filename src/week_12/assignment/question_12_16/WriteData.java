package src.week_12.assignment.question_12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\inar-java" +
                "\\src\\src\\week_12\\assignment\\question_12_16\\text.txt");


        if(file.exists()){
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        for (int i = 0; i < 100; i++) {
            output.println("Hello " + i);
        }


        output.close();
    }
}
