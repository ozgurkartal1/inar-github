package src.week_11.assignment.question_08;

import java.util.Date;

public class Transaction {
    private Date date;

    private char type;

    private double amount;

    private double balance;

    private String description;

    Transaction(){
        this.date = new Date();
    }

    Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription(char type) {
        this.type = type;
        if (this.type == 'w'){
            return "Withdraw from ATM";
        }

        if(this.type == 'd'){
            return "Deposit to Bank";
        }

        return "Nothing";
    }

    public String toString(){
        return "Date : " + date +
               "\nTransaction type : " + (type == 'w' ? "Withdraw" : "Deposit") +
               "\nAmount : " + amount +
               "\nBalance : " + balance +
               "\nDescription : " + getDescription(this.type);
    }
}
