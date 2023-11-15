package src.week_10.assignment.Question_10_03;

public class MyInteger {
    private int value;

    MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    boolean isEven(){
        return value % 2 == 0;
    }

    boolean isOdd(){
        return value % 2 != 0;
    }

    boolean isPrime(){
        for (int i = 2; i < value / 2; i++) {
            if(value % i == 0){
                return false;
            }
        }

        return true;
    }
    static boolean isEven(MyInteger myInteger){
        return myInteger.value % 2 == 0;
    }

    static boolean isOdd(MyInteger myInteger){
        return myInteger.value % 2 != 0;
    }

    static boolean isPrime(MyInteger myInteger){
        int result = myInteger.value;;

        for (int i = 2; i < result / 2; i++) {
            if(result % i == 0){
                return false;
            }
        }

        return true;
    }

    boolean equals(int value){
        return value == this.value;
    }

    boolean equals(MyInteger myInteger){
        return myInteger.value == this.value;
    }

    static int parseInt(char[] array){
        int power = 1;
        int result = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            int a = array[i];
            result += a * power;

            power *= 10;
        }

        return result;
    }

    static int parseInt(String s){
        int power = 1;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            result += (s.charAt(i) - '0') * power;

            power *= 10;
        }

        return result;

    }
}
