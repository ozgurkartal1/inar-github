package src.week_09.assignment.Question_09_07;

import java.util.Date;

public class Account {
    private int id;
    private double balance;

    private double annualInterestRate;

    private Date dateCreated;

    Account(){

    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId(){
        return id;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    double getBalance(){
        return balance;
    }

    void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    double getAnnualInterestRate(){
        return annualInterestRate;
    }

    void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

     Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() / 100;
    }

    void withdraw(double amount){
        balance -= amount;
    }
    void deposit(double amount){
        balance += amount;
    }


}
