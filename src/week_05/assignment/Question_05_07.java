package src.week_05.assignment;

public class Question_05_07 {

    public static void main(String[] args) {
        int tuition = 10000;
        int sum = 0;

        int i = 1;

        while(i <= 10){
            tuition *= 1.05;
            i++;
        }
        System.out.println("Tuition in ten years: $" + tuition);

        for (int j = 1; j <= 4; j++) {
            tuition *= 1.05;
            sum += tuition;
        }
        System.out.println("Total cost for four years' worth of tuition after the tenth year : $" + sum);
    }

}
