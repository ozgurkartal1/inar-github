package src.week_05.live_class;

public class FizzBuzz {

    public static void main(String[] args) {

        int k = 1;

        while(k <= 100){

            if(k % 3 == 0 && k % 5 == 0){
                System.out.println("fizzbuzz");
                k++;
                continue;
            } else if (k % 3 == 0) {
                System.out.println("fizz");
                k++;
                continue;
            } else if (k % 5 == 0) {
                System.out.println("buzz");
                k++;
                continue;
            }

            System.out.println(k);
            k++;
        }
    }
}
