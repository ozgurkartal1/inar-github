package src.week_12.assignment.question_12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_16 {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length != 4){
            System.out.println("Usage : sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sorceFile = new File(args[0]);

        if(!sorceFile.exists()){
            System.out.println("This file does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);

        if(targetFile.exists()){
            System.out.println("This file already exist");
            System.exit(3);
        }

        try(
                Scanner input = new Scanner(sorceFile);
                PrintWriter output = new PrintWriter(targetFile);
        ){
            while(input.hasNext()){
                String s1 = input.nextLine();
                s1 = s1.replaceAll(args[2], args[3]);
                output.println(s1);
            }
        }
    }
}
