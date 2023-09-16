package src.week_06.live_class;

public class Methods_1 {
    public static void main(String[] args) {

        int sum = sumOfNumber1ToNumber2(1,10);
        System.out.println("Sum from 1 to 10 is " + sum);

        sum = sumOfNumber1ToNumber2(20,37);
        System.out.println("Sum from 20 to 37 is " + sum);

        sum = sumOfNumber1ToNumber2(35,49);
        System.out.println("Sum from 35 to 49 is " + sum);

    }
    public static int sumOfNumber1ToNumber2(int a, int b){
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;
        }
        return sum;
    }
}
