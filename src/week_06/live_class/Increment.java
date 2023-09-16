package src.week_06.live_class;

public class Increment {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);

        x = increment(x);
        System.out.println("After the call, x is " + x);

    }

    private static int increment(int number) {
        return ++number;
    }



}
