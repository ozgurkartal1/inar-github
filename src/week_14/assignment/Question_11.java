package week_14.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Question_11 {

    public static void main(String[] args) throws FileNotFoundException {
        
       File file = new File("C:\\Users\\PC\\IdeaProjects\\Questions" +
               "\\src\\Question_10.java");

       if(!file.exists()){
           System.out.println("Go Home");
           System.exit(1);
       }

       if(isValidPair(file)){
           System.out.println("The source code has correct pairs of grouping symbols");
       }else{
           System.out.println("The source code has not correct pairs of grouping symbols");
       }


    }

    private static boolean isValidPair(File file) throws FileNotFoundException {
        Stack<Character> stack = new Stack<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()){
                String s = input.nextLine();
                for(char ch : s.toCharArray()){
                    if (ch == '(' || ch == '[' || ch == '{') {
                        stack.push(ch);
                    }else if(ch == '}' || ch == ']' || ch == ')'){
                        if(stack.isEmpty() || !isMatched(stack.pop(), ch)){ // ({, ( , [, ], ), })
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static boolean isMatched(Character pop, Character addition) {
        if(pop == '(' && addition == ')'){
            return true;
        }

        if(pop == '[' && addition == ']'){
            return true;
        }

        return pop == '{' && addition == '}';
    }


}
