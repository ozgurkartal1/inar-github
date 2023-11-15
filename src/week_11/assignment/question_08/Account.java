package src.week_11.assignment.question_08;

import java.util.ArrayList;

public class Account{

    private String name;

    private int id;

    private double balance;

    private ArrayList<Transaction> list;


    Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        list = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getList() {
        return list;
    }

    public void deposit(double amount, char type){
        Transaction t = new Transaction();
        balance = balance + amount;
        list.add(new Transaction(type, amount, this.balance, t.getDescription(type)));
    }

    public void withdraw(double amount, char type){
        Transaction t = new Transaction();
        balance = balance - amount;
        list.add(new Transaction(type, amount, this.balance, t.getDescription(type)));
    }

    public void display(){
        for (Transaction obj : getList()){
            System.out.println(obj.toString());
            System.out.println("------------------------");
        }
    }

    public String toString(){
        return "Name : " + name +
               "\nId : " + id +
               "\nBalance : " + balance;
    }
}
