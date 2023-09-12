package src.week_05.assignment;

public class Question_05_15 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = '!'; i <= 126; i++) {
            char ch = (char)i;
            System.out.print(ch + " ");
            count++;
            if(count != 0 && count % 10 == 0){
                System.out.println();
            }
        }
    }
}
