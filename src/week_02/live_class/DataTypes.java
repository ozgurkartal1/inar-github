package week_02.live_class;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a byte Number : ");
        byte byteNumber = input.nextByte();

        System.out.println("Enter a short Number : ");
        short shortNumber = input.nextShort();

        System.out.println("Enter a integer number : ");
        int integerNumber = input.nextInt();

        System.out.println("Enter a long Number : ");
        long longNumber = input.nextLong();

        System.out.println(Math.pow(2, 3));


    }
}
