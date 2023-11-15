package src.week_11.assignment.question_02;

import java.util.Date;

public class Employee extends Person{
    private int office;
    private double salary;
    private Date dateHired;

    Employee(){
        dateHired = new Date();
    }

    Employee(int office, double salary, Date date,
             String name, String address, String phoneNumber, String emailAddress){

        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = date;
    }

    public int getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDate() {
        return dateHired;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\noffice : " + office +
               "\nsalary : " + salary +
               "\nHired Date : " + dateHired;

    }
}
