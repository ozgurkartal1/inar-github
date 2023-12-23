package src.week_12.assignment.question_12_08;

public class HexFormatException extends NumberFormatException{

    HexFormatException(){
        super("it is not a hex string!");
    }

    HexFormatException(String message){
        super(message);
    }
}
