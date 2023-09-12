package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year : ");
        int firstDayOfYear = input.nextInt();

        String monthName = "";
        int totalDays = 0;
        int daysInMonth = 0;

        for (int i = 1; i <= 12 ; i++) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                if (i - 1 == 1 || i - 1 == 3 || i - 1 == 5 ||
                        i - 1 == 7 || i - 1 == 8 || i - 1 == 10 || i - 1 == 12){
                    totalDays += 31;
                } else if (i - 1 == 4 || i - 1 == 6 || i - 1 == 9 || i - 1 == 11) {
                    totalDays += 30;
                }else if (i - 1 == 2){
                    totalDays += 29;
                }
                if (i == 1 || i == 3 || i == 5 ||
                        i == 7 || i == 8 || i == 10 || i == 12){
                    daysInMonth = 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    daysInMonth = 30;
                }else{
                    daysInMonth = 29;
                }
            }else{
                if (i - 1 == 1 || i - 1 == 3 || i - 1 == 5 ||
                        i - 1 == 7 || i - 1 == 8 || i - 1 == 10 || i - 1 == 12){
                    totalDays += 31;
                } else if (i - 1 == 4 || i - 1 == 6 || i - 1 == 9 || i - 1 == 11) {
                    totalDays += 30;
                }else if(i - 1 == 2){
                    totalDays += 28;
                }
                if (i == 1 || i == 3 || i == 5 ||
                        i == 7 || i == 8 || i == 10 || i == 12){
                    daysInMonth = 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    daysInMonth = 30;
                }else {
                    daysInMonth = 28;
                }
            }
            switch (i){
                case 1 -> monthName = "January";
                case 2 -> monthName = "February";
                case 3 -> monthName = "March";
                case 4 -> monthName = "April";
                case 5 -> monthName = "May";
                case 6 -> monthName = "June";
                case 7 -> monthName = "July";
                case 8 -> monthName = "August";
                case 9 -> monthName = "September";
                case 10 -> monthName = "October";
                case 11 -> monthName = "November";
                case 12 -> monthName = "December";
            }
            System.out.println("\n");
            System.out.println(monthName + " " + year);
            System.out.println("--------------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            int firstDayOfMonth = (firstDayOfYear + totalDays) % 7;

            for(int j = 0 ; j < firstDayOfMonth ; j++){
                System.out.print("      ");
            }
            for (int j = 1; j <= daysInMonth; j++) {
                System.out.printf("%2d    ",j);
                if((firstDayOfMonth + j) % 7 == 0){
                    System.out.println();
                }
            }
        }
    }
}
