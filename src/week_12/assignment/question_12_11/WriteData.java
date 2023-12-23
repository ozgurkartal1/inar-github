package src.week_12.assignment.question_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\inar-java\\src\\src\\" +
                "week_12\\assignment\\question_12_11\\text.txt");

        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        output.println("John is sick");
        output.println("John will go to hospital");
        output.println("John have to take pills to be good");

        output.close();
    }
}
