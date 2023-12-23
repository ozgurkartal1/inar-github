package src.week_12.assignment.question_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_14 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a file's path name : ");
        String fileName = input.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("it does not exist");
            System.exit(1);
        }

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();

        double sum = 0;

        try (Scanner input1 = new Scanner(file)) {
            while (input1.hasNext()) {
                list.add(input1.nextLine());
            }
        }

        for (String string : list) {
            String s = "";
            for (int j = 0; j < string.length() - 1; j++) {
                if (Character.isDigit(string.charAt(j))) {
                    s += string.charAt(j);
                    if (!Character.isDigit(string.charAt(j + 1))) {
                        list1.add(Double.parseDouble(s));
                        s = "";
                    }
                }
            }
        }

        for (Double aDouble : list1) {
            sum += aDouble;
        }

        System.out.println("Sum " + sum + "\nCount : " + list1.size() +
                "\nAverage " + (sum / list1.size()));

    }
}
