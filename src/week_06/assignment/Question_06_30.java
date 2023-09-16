package src.week_06.assignment;

public class Question_06_30 {

    public static void main(String[] args) {

        int num1 = getNumberFrom1To6();
        int num2 = getNumberFrom1To6();
        int sum = getSum(num1, num2);

        System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);

        if(firstCheckForWinAndLose(sum)){
            System.out.println("You win");
        }
        if (!firstCheckForWinAndLose(sum) && !firstCheckForAgainThrow(sum)){
            System.out.println("You lose");
        }
        if (firstCheckForAgainThrow(sum)){
            System.out.println("Point is " + sum);

            num1 = getNumberFrom1To6();
            num2 = getNumberFrom1To6();
            sum = getSum(num1, num2);

            System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);

            if(sum != 7){
                System.out.println("You win");
            }else{
                System.out.println("You lose");
            }
        }
    }

    public static boolean firstCheckForWinAndLose(int sum){
        return sum == 7 || sum == 11 || !firstCheckForAgainThrow(sum);
    }

    public static boolean firstCheckForAgainThrow(int sum) {
        return sum != 7 && sum != 11 && sum !=2 && sum != 3 && sum != 12;
    }
    public static int getNumberFrom1To6(){
        return (int)(Math.random() * 6) + 1;
    }
    public static int getSum(int num1, int num2){
        return num1 + num2;
    }

}
