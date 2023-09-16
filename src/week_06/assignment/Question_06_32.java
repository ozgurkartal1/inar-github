package src.week_06.assignment;

public class Question_06_32 {
    public static void main(String[] args) {

        int count = 0;
        int countForWinning = 0;

        do {
            int num1 = getNumberFrom1To6();
            int num2 = getNumberFrom1To6();
            int sum = getSum(num1, num2);

            count++;

            System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);

            if(firstCheckForWinAndLose(sum)){
                System.out.println("You win");
                countForWinning++;
            }
            if (!firstCheckForWinAndLose(sum) && !firstCheckForAgainThrow(sum)){
                System.out.println("You lose");
            }
            if (firstCheckForAgainThrow(sum)){
                System.out.println("Point is " + sum);

                count++;

                num1 = getNumberFrom1To6();
                num2 = getNumberFrom1To6();
                sum = getSum(num1, num2);

                System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);

                if(sum != 7){
                    System.out.println("You win");
                    countForWinning++;
                }else{
                    System.out.println("You lose");
                }
            }
        }while(count < 10000);

        System.out.println("Number of winning games is " + countForWinning);
    }
    public static boolean firstCheckForWinAndLose(int sum){
        return sum == 7 || sum == 11 ;
    }

    public static boolean firstCheckForAgainThrow(int sum) {
        return sum != 7 && sum != 11 && sum != 2 && sum != 3 && sum != 12;
    }
    public static int getNumberFrom1To6(){
        return (int)(Math.random() * 6) + 1;
    }
    public static int getSum(int num1, int num2){
        return num1 + num2;
    }


}
