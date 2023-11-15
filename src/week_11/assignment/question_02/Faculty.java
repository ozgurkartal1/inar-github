package src.week_11.assignment.question_02;

import java.util.Date;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    Faculty(){

    }

    Faculty(String officeHours, String rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }

    Faculty(String officeHours, String rank,
            int office, double salary, Date date,
            String name, String address, String phoneNumber, String emailAddress){

        super(office, salary, date, name, address, phoneNumber, emailAddress);

        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString(){
        return super.toString() +
               "\nOffice hours : " + officeHours +
               "\nRank : " + rank;
    }
}
