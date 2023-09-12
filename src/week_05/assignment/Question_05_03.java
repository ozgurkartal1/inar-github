package src.week_05.assignment;

public class Question_05_03 {

    public static void main(String[] args) {

        System.out.println("Kilograms\t\tPounds");
        for(int i = 1 ; i < 200 ; i += 2){
            System.out.printf("%1d\t\t\t\t%.1f\n", i, (i * 2.2));
        }
    }
}
