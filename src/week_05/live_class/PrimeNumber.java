package src.week_05.live_class;

public class PrimeNumber {

    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int k = 2;
        int countOfPrimeNumbers = 0;

        while(countOfPrimeNumbers < NUMBER_OF_PRIMES){

            boolean isPrime = true;

            for(int i = 2 ; i < k ; i++){

                if(k % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(k + " ");
                countOfPrimeNumbers++;
                if(countOfPrimeNumbers % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.println();
                }
            }
            k++;
        }
    }
}
