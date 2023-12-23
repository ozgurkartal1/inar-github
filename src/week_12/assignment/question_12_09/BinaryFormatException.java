package src.week_12.assignment.question_12_09;

public class BinaryFormatException extends NumberFormatException{

    BinaryFormatException(){
        super("it is not binary string!");
    }

    BinaryFormatException(String message){
        super(message);
    }
}
