package week_03.assignment;

import java.util.Scanner;

public class Question_03_33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1 : ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2 : ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();

        if(price1 / weight1 < price2 / weight2){
            System.out.println("Package1 has a better price");
        }else if(price2 / weight2 < price1 / weight1){
            System.out.println("Package 2 has a better price");
        }else{
            System.out.println("Teo packages have the same price");
        }
    }
}
