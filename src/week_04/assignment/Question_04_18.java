package week_04.assignment;

import java.util.Scanner;

public class Question_04_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters : ");
        String majorAndStatus = input.nextLine();

        char major = majorAndStatus.charAt(0);
        char status = majorAndStatus.charAt(1);

        if (major == 'M') {
            System.out.print("Mathematics");
        } else if (major == 'C') {
            System.out.print("Computer Science");
        } else if (major == 'I') {
            System.out.print("Information Technology");
        }else {
            System.out.print("Invalid input");
            System.exit(1);
        }

        System.out.print(" ");

        switch (status - '0') {
            case 1 -> System.out.println("Freshman");
            case 2 -> System.out.println("Sophomore");
            case 3 -> System.out.println("Junior");
            case 4 -> System.out.println("Senior");
            default -> {
                System.out.println("Invalid input");
                System.exit(1);
            }
        }
    }
}
