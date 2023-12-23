package week_12.assignment.question_12_01;

public class Question_12_01 {

    public static void main(String[] args) {

        calculator(args);
    }

    public static void calculator(String[] args){
        double number1;
        double number2;

        try {
            number1 = Double.parseDouble(args[0]);

        }catch (NumberFormatException e){
            System.out.println("Invalid input : " + args[0]);
        }

        try {
            number2 = Double.parseDouble(args[2]);
        }catch (NumberFormatException e){
            System.out.println("Invalid input : " + args[2]);
        }
    }
}
