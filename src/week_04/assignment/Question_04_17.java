package week_04.assignment;

import java.util.Scanner;

public class Question_04_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Enter the first three letters of month name (with first letter is uppercase)
        System.out.print("Enter a month: ");
        String monthName = input.nextLine();

        // Prompt the user to enter a year :
        System.out.print("Enter a year : ");
        int year = input.nextInt();



            if(year % 4 == 0 && year % 100 != 0 ||year % 400 == 0){
            if(monthName.equals("Jan") || monthName.equals("Mar") || monthName.equals("May") ||
               monthName.equals("Jul") || monthName.equals("Aug") ||
               monthName.equals("Oct") || monthName.equals("Dec")){

                System.out.println(monthName + " " + year + " has 31 days");
            }else if(monthName.equals("Apr") || monthName.equals("Jun") ||
                     monthName.equals("Sep") || monthName.equals("Nov")){

                System.out.println(monthName + " " + year + " has 30 days");
            }else {
                System.out.println(monthName + " " + year + " has 29 days");
            }

        }else{
            if(monthName.equals("Jan") || monthName.equals("Mar") || monthName.equals("May") ||
                    monthName.equals("Jul") || monthName.equals("Aug") ||
                    monthName.equals("Oct") || monthName.equals("Dec")){

                System.out.println(monthName + " " + year + " has 31 days");
            }else if(monthName.equals("Apr") || monthName.equals("Jun") ||
                    monthName.equals("Sep") || monthName.equals("Nov")){

                System.out.println(monthName + " " + year + " has 30 days");
            }else {
                System.out.println(monthName + " " + year + " has 28 days");
            }
        }
    }
}
