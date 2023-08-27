package week_04.live_class;

import java.util.Scanner;

public class MinMaxAbs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min, max,mid;

        System.out.print("Enter first number : ");
        int number1 = Math.abs(input.nextInt());

        System.out.print("Enter second number : ");
        int number2 = Math.abs(input.nextInt());

        System.out.print("Enter third number : ");
        int number3 = Math.abs(input.nextInt());

        int tempMax = Math.max(number1, number2);
       max = Math.max(tempMax, number3);

        System.out.printf("The max number is %d\n", max);

       int tempMin = Math.min(number1, number2);
       min = Math.min(tempMin, number3);

       System.out.printf("The min number is %d\n", min);



       if(number1 != max && number1 != min){
            mid = number1;
        }else if(number2 != max && number2 != min){
            mid = number2;
        } else{
            mid = number3;
        }

        System.out.printf("The mid number is %d", mid);

    }
}
