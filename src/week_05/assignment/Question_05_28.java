package src.week_05.assignment;

import java.util.Scanner;

public class Question_05_28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year : ");
        int firstDayOfYear = input.nextInt();

        String monthName = "";
        String dayName = "";
        int totalDays = 0;

        for (int i = 1; i <= 12; i++) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                if (i - 1 == 1 || i - 1 == 3 || i - 1 == 5 ||
                i - 1 == 7 || i - 1 == 8 || i - 1 == 10 || i - 1 == 12){
                    totalDays += 31;
                } else if (i - 1 == 4 || i - 1 == 6 || i - 1 == 9 || i - 1 == 11) {
                    totalDays += 30;
                }else if (i - 1 == 2){
                    totalDays += 29;
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
            switch ((firstDayOfYear + totalDays) % 7){
                case 0 -> dayName = "Sunday";
                case 1 -> dayName = "Monday";
                case 2 -> dayName = "Tuesday";
                case 3 -> dayName = "Wednesday";
                case 4 -> dayName = "Thursday";
                case 5 -> dayName = "Friday";
                case 6 -> dayName = "Saturday";

            }
            System.out.println(monthName + " 1, " + year + " is " + dayName);
        }


    }
}
