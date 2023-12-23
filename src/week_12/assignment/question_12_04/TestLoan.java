package week_12.assignment.question_12_04;

public class TestLoan {

    public static void main(String[] args) {

        try {
            new Loan(2.5, -5, 10200);
        }
        catch (IllegalArgumentException e){
            System.out.print("Wrong input !");
            System.out.println(e.getMessage());
        }
    }
}
