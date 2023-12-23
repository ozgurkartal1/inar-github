package src.week_12.assignment.question_12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_13 {

    public static <input1> void main(String[] args) throws FileNotFoundException {

        if (args.length != 1) {
            System.out.println("No");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("it does not exist");
            System.exit(2);
        }

        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        

        int count = 1;
        int countOfCharacter = 0;

        while (count <= 2) {

            try (
                    Scanner input = new Scanner(file)

            ) {
                if (count == 1) {
                    while (input.hasNext()) {
                        lines.add(input.nextLine());
                    }
                    
                    
                }
                
                if(count == 2){
                    while (input.hasNext()){
                        words.add(input.next());
                    }
                }
                
                count++;

            }
        }

        System.out.println(lines.size());
        System.out.println(words.size());

        for (String ch : lines) {
            countOfCharacter += ch.length();
        }

        System.out.println(countOfCharacter);

    }

}
