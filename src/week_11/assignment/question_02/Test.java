package src.week_11.assignment.question_02;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

        System.out.println("\t\t_Person_");

        display(new Person("Gurol", "Istanbul",
                "phoneNumber", "gurol@inar.com"));


        System.out.println("----------------------------------------------");

        System.out.println("\t\t_Student_");

        display(new Student(0,"Nafiz", "Ankara",
                "3333333333", "nafiz0@gmail.com"));

        System.out.println("--------------------------------------------------");

        System.out.println("\t\t_Employee_");

        display (new Employee(910, 60000, new Date(),
                "Recai", "Istanbul",
                "666666666", "recai@gmail.com"));

        System.out.println("---------------------------------------------");

        System.out.println("\t\t_Faculty_");

         display(new Faculty("10 am to 6 pm", "manager",
                 101, 50000, new Date(),
                 "Serhat", "Texas, Dallas",
                "66666666", "serhat@inar.com"));

        System.out.println("-----------------------------------------------");

        System.out.println("\t\t_Staff_");

        display(new Staff("CEO", 101, 50000, new Date(),
                "Serhat", "Texas, Dallas", "66666666",
                "serhat@inar.com"));

    }

    public static void display(Object obj) {
        System.out.println(obj.toString());
    }

}


