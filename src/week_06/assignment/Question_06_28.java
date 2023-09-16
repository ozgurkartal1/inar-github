package src.week_06.assignment;

public class Question_06_28 {

    public static void main(String[] args) {

        System.out.print("p\t\t\t2^p - 1\n");
        System.out.println("---------------------");

        for (int i = 2; i <= 31 ; i++) {
            if(isPrime(i) && isPrime(mersenneNumber(i))){
                System.out.print(i + "\t\t\t" + mersenneNumber(i) + "\n");
            }
        }
    }

    public static int mersenneNumber(int i) {

        return (int)(Math.pow(2, i)) - 1;
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j <= i / 2 ; j++) {
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
