package src.week_12.assignment.question_12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(args[0]);

        File[] files = file.listFiles();


        for (int i = 1; i < files.length; i++) {

            ArrayList<String> list = new ArrayList<>();

            try(Scanner input = new Scanner(files[i])) {

                while (input.hasNext()){
                    String s1 = input.nextLine();

                    list.add(s1.replaceAll(args[1], args[2]));
                }

                PrintWriter output = new PrintWriter(files[i]);

                for (String s : list) {
                    output.println(s);
                }

                output.close();
            }
        }
    }


}
