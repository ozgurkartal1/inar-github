package src.week_06.assignment;

public class Question_06_10 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 2; i < 10000; i++) {
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println("The number of prime numbers less than 10,000 is : " + count);

    }
    public static boolean isPrime(int number){

        for (int i = 2; i <= number / 2 ; i++) {
         if(number % i == 0){
             return false;
         }
        }
        return true;
    }
}
