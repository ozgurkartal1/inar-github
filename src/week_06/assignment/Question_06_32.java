package src.week_06.assignment;

public class Question_06_32 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 10000; i++) {
           if(playCraps()){
               count++;
           }
        }

        System.out.println("Number of winning games : " + count);

    }
    public static boolean playCraps(){
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;


        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

        if(isWin(sum)){
            System.out.println("You win");
            return true;
        }
        if(isLose(sum)){
            System.out.println("You lose");
        }
        if(!isWin(sum) && !isLose(sum)){
            System.out.println("Point is " + sum);

            do{
                dice1 = rollDice();
                dice2 = rollDice();

                System.out.println("You rolled " + dice1 + " + " +  dice2 + " = " + (dice1 + dice2));

                if(dice1 + dice2 == sum){
                    System.out.println("You win");
                    return true;
                }
                if(dice1 + dice2 == 7){
                    System.out.println("You lose");
                }

            }while(dice1 + dice2 != sum && dice1 + dice2 != 7);

        }

        return false;
    }
    private static boolean isWin(int sum) {
        return sum == 7 || sum == 11;
    }
    public static boolean isLose(int sum){
        return sum == 2 || sum == 3 || sum == 12;
    }

    private static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }

}
