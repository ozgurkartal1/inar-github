package week_04.assignment;

import java.util.Scanner;

public class Question_04_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name : ");
        String employeeName = input.nextLine();

        System.out.print("Enter number of hours worked in a week : ");
        double numberOfHoursWorkedInAWeek = input.nextDouble();

        System.out.print("Enter hourly pay rate : ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate : ");
        double federalTaxWithholdingRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate : ");
        double stateTaxWithholdingRate = input.nextDouble();

        double grossPay = payRate * numberOfHoursWorkedInAWeek;
        double federalWithholding = grossPay * federalTaxWithholdingRate;
        double stateWithholding = grossPay * stateTaxWithholdingRate;

        System.out.println("Employee name : " + employeeName);
        System.out.println("Hours worked : " + numberOfHoursWorkedInAWeek);
        System.out.println("Pay Rate : $" + payRate);
        System.out.println("GrossPay : $" + grossPay);
        System.out.print("Deductions : \n");
        System.out.printf("  Federal Withholding (%4.1f%1s) : $%4.1f\n", (federalTaxWithholdingRate * 100),"%", federalWithholding);
        System.out.printf("  State Withholding (%4.1f%1s) : $%4.2f\n",(stateTaxWithholdingRate * 100), "%", stateWithholding);
        System.out.printf("  Total Deduction : $%4.2f\n", (federalWithholding + stateWithholding));
        System.out.printf("Net pay : $%4.2f\n", (grossPay -federalWithholding - stateWithholding));
    }
}
