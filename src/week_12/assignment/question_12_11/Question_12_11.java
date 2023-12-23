package src.week_12.assignment.question_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_11 {

    public static <s2> void main(String[] args) throws FileNotFoundException {

        if (args.length != 2) {
            System.out.println("NO");
            System.exit(1);
        }

        File sourceFile = new File(args[1]);
        String toRemove = args[0];
        String s2 = "";

        if (!sourceFile.exists()) {
            System.out.println("it does not exist");
            System.exit(2);
        }

        try (
                Scanner input = new Scanner(sourceFile)

        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                s2 += s1.replaceAll(toRemove, "") + "\n";
            }
        }

        PrintWriter output = new PrintWriter(sourceFile);
        output.println(s2);
        output.close();

    }
}
