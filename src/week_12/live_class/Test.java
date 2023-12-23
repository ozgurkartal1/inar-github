package src.week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scores.txt");

        PrintWriter output = new PrintWriter(file);
        output.println("Mehmet\nOzgur");

        output.close();

    }
}
