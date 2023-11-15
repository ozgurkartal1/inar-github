package src.week_11.assignment.question_08;

public class Test {

    public static void main(String[] args) {

        Account account = new Account("George", 1122, 1000);

        System.out.println(account.toString());

        System.out.println("-----------------------");

        account.deposit(30, 'd');
        account.deposit(40, 'd');
        account.deposit(50, 'd');


        account.withdraw(5, 'w');
        account.withdraw(4, 'w');
        account.withdraw(2, 'w');

        account.display();

    }
}
