package src.week_09.assignment.Question_09_07;

import java.util.Date;

public class Question_09_07 {

    public static void main(String[] args) {

        Account account1 = new Account(1122, 20_000);
        Date date = new Date();

        account1.setAnnualInterestRate(4.5);
        account1.setDateCreated(date);

        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.println("\t\t\tAccount Statement : ");
        System.out.println("-----------------------------------------------------");
        System.out.printf("Account ID : %d\nDate created : %s\nBalance : $%.2f\nMonthly Interest : %.2f",
                account1.getId(), account1.getDateCreated(), account1.getBalance(), account1.getMonthlyInterest());

    }
}
