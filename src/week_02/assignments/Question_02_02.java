package week_02.assignments;

import java.util.Scanner;

public class Question_02_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder : ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is " + (int) (area * 10000) / 10000.0);
        System.out.println("The volume is " + (int) (volume = Math.ceil(volume * 10)) / 10.0);
    }
}
