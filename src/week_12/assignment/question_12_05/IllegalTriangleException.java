package week_12.assignment.question_12_05;

public class IllegalTriangleException extends Exception{

    IllegalTriangleException(){
        super("The sum of any two sides must be greater than the remaining side");
    }

    IllegalTriangleException(String message){
        super(message);
    }
}
