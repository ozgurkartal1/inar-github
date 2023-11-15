package src.week_10.assignment.Question_10_03;

public class Test {

    public static void main(String[] args) {

        MyInteger integer = new MyInteger(41614161);

        System.out.println("getValue() : " + integer.getValue());

        System.out.println("isEven() : " + integer.isEven());

        System.out.println("isOdd() : " + integer.isOdd());

        System.out.println("isPrime() : " + integer.isPrime());

        System.out.println("equals(10) : " + integer.equals(10));

        System.out.println("equals(MyInteger(41614161)) : " +
                integer.equals(new MyInteger(41614161)));

        System.out.println("isEven(41614161) : " +
                MyInteger.isEven(new MyInteger(41614161)));

        System.out.println("isOdd(41614161) : " +
                MyInteger.isOdd(new MyInteger(41614161)));

        System.out.println("isPrime(41614161) : " +
                MyInteger.isPrime(new MyInteger(41614161)));

        System.out.println("parseInt(char[] {1, 2, 3}) : " +
                MyInteger.parseInt(new char[]{1, 2, 3}));

        System.out.println("parseInt(String 123) : " +
                MyInteger.parseInt("123"));



    }
}
