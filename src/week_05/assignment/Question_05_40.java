package src.week_05.assignment;

public class Question_05_40 {

    public static void main(String[] args) {

        int countOfHeads = 0;
        int countOfTails = 0;

        for (int i = 0; i < 1000000; i++) {
            int random = (int)(Math.random() * 2);

            if(random == 0){
                countOfHeads++;
            }else{
                countOfTails++;
            }
        }

        System.out.print("Heads : " + countOfHeads + "\nTails : " + countOfTails);
    }
}
