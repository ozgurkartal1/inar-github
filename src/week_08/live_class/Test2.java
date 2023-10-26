package src.week_08.live_class;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a char : ");

        char ch = input.nextLine().charAt(0);

        System.out.println(ch);
    }
}
