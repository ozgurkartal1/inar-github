package src.week_11.assignment.question_02;

import java.util.Date;

public class Staff extends Employee{
    private String title;

    Staff(){

    }

    Staff(String title){
        this.title = title;
    }

    Staff(String title, int office, double salary, Date date,
          String name, String address, String phoneNumber, String emailAddress){
        super(office, salary, date, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nTitle : " + title;
    }
}
