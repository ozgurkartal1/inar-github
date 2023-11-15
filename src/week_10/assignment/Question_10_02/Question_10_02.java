package src.week_10.assignment.Question_10_02;

public class Question_10_02 {

    public static void main(String[] args) {

        BMI bmi = new BMI("Ozgur", 27, 202.8, 6, 0.83);

        System.out.println("Name : " + bmi.getName());
        System.out.println("BMI : " + bmi.calculateBMI() + " " + bmi.getStatus());

        BMI bmi1 = new BMI("Kartal", 27, 186, 6.5, 0.87);

        System.out.println("Name : " + bmi1.getName());
        System.out.println("BMI : " + bmi1.calculateBMI() + " " + bmi1.getStatus());


    }
}
