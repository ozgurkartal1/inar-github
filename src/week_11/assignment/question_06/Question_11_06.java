package src.week_11.assignment.question_06;

import src.week_09.live_class.Circle;
import src.week_10.live_class.Loan.Loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Question_11_06 {

    public static void main(String[] args) {

        ArrayList<Object> object1 = new ArrayList<>();

        object1.add(new Loan());
        object1.add(new Date());
        object1.add("InarAcademy");
        object1.add(new Circle(1));

        for (Object object : object1){
            System.out.println(object.toString());
            System.out.println("--------------------------------------");
        }


    }


}
