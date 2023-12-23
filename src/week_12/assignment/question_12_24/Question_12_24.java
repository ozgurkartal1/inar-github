package src.week_12.assignment.question_12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_24 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\PC\\IdeaProjects\\inar-java\\" +
                "src\\src\\week_12\\assignment\\question_24\\salary.txt");

        if(!file.exists()){
            System.out.println(file.getName() + " does not exist");
            System.exit(1);
        }

        ArrayList<String> list = new ArrayList<>();


        try(
                Scanner input = new Scanner(file)
        ){
            while(input.hasNext()){
                String s = input.next();
                s = s.replaceAll(",", ".");
                if(!(s.contains("FirstName")
                || s.contains("LastName"))){
                    list.add(s);
                }
            }
        }

        BigDecimal[] totalSalaries = {BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO};
        int[] numberOfEmployeesInAStat = new int[3];

        for (int i = 0; i < list.size(); i += 2) {
            if(list.get(i).equals("assistant")){
                totalSalaries[0] = totalSalaries[0].add(new BigDecimal(list.get(i + 1)));
                numberOfEmployeesInAStat[0] ++;
            }

            if(list.get(i).equals("associate")){
                totalSalaries[1] = totalSalaries[1].add(new BigDecimal(list.get(i + 1)));
                numberOfEmployeesInAStat[1]++;
            }

            if(list.get(i).equals("full")){
                totalSalaries[2] = totalSalaries[2].add(new BigDecimal(list.get(i + 1)));
                numberOfEmployeesInAStat[2]++;
            }
        }

        BigDecimal total = (totalSalaries[0].add(totalSalaries[1])).add(totalSalaries[2]);

        int totalEmployee = numberOfEmployeesInAStat[0] + numberOfEmployeesInAStat[1] +
                numberOfEmployeesInAStat[2];

        System.out.println("Total Salary for assistant professors : " + totalSalaries[0]);
        System.out.println("Total Salary for associate professors : " + totalSalaries[1]);
        System.out.println("Total Salary for full professors : " + totalSalaries[2]);
        System.out.println("Total Salary for all faculty : " + total);

        System.out.println("-------------------------------------------------------------");

        System.out.println("Average salary for assistant professors : " +
                totalSalaries[0].divide(new BigDecimal(numberOfEmployeesInAStat[0]), 2, RoundingMode.CEILING));

        System.out.println("Average salary for associate professors : " +
                totalSalaries[1].divide(new BigDecimal(numberOfEmployeesInAStat[1]), 2, RoundingMode.CEILING));

        System.out.println("Average salary for full professors : " +
                totalSalaries[2].divide(new BigDecimal(numberOfEmployeesInAStat[2]), 2, RoundingMode.CEILING));

        System.out.println("Average salary for all faculty : " +
                total.divide(new BigDecimal(totalEmployee), 2, RoundingMode.CEILING));




    }
}
