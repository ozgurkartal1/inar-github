package src.week_07.assignment;

public class Question_07_06 {

    public static void main(String[] args) {

        int[] primeNumbers = new int[50];

        int k = 2;
        int count = 0;


        while (count != 50) {

            boolean st = true;

            for (int i = 0; i < count; i++) {
                double number = Math.sqrt(k);
                if (number >= primeNumbers[i]) {
                    if(k % primeNumbers[i] == 0){
                        st = false;
                        break;
                    }
                }
            }

            if(st){
                primeNumbers[count] = k;
                count++;
            }

            k++;
        }

        print(primeNumbers);

    }

    public static void print(int[] primeNumbers) {
        for (int i = 0 ; i < primeNumbers.length ; i++){
            if((i + 1) % 10 == 0){
                System.out.printf("%3d\n", primeNumbers[i]);
            }else{
                System.out.printf("%3d ", primeNumbers[i]);
            }
        }
    }
}
