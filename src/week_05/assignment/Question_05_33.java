package src.week_05.assignment;

public class Question_05_33 {

    public static void main(String[] args) {

        int number = 1;

        while (number < 10000){

            int sumOfDivisor = 0;

            for (int j = 1; j < number ; j++) {
                if(number % j == 0){
                    sumOfDivisor += j;
                }
            }
            if(sumOfDivisor == number){
                System.out.println(number);
            }
            number++;
        }
    }
}
