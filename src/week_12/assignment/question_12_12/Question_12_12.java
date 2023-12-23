package src.week_12.assignment.question_12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_12 {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length != 1){
            System.out.println("NO");
            System.exit(1);
        }

        File file = new File(args[0]);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        if(!file.exists()){
            System.out.println("This file does not exist");
            System.exit(2);
        }

        try(
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()){
                list1.add(input.nextLine());
            }
        }

        PrintWriter output = new PrintWriter(file);

        for (int i = 0; i < list1.size(); i++) {
            int index = 0;
            if(list1.get(i).contains("{")){
                index = i;
                list1.remove(index);
                String s = list1.get(i - 1) + " {";
                list1.remove(index - 1);
                list1.add((index - 1), s);
                i--;
            }
        }



        for (String s : list1) {
            output.println(s);
        }

        output.close();
    }
}
