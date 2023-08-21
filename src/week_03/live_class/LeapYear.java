package week_03.live_class;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year -> ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);

        if(isLeapYear){
            System.out.println(year + " is a leap year ? -> " + isLeapYear );
        } else {
            System.out.println(year + " is not leap year ? -> " + isLeapYear);
        }
    }
}
