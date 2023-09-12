package src.week_05.assignment;

public class Question_05_27 {

    public static void main(String[] args) {

        int countOfLeapYears = 0;

        System.out.println("All the leap years from 101 to 2100");

        for (int year = 101; year <= 2100 ; year++) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.print(year + " ");
                countOfLeapYears++;
                if(countOfLeapYears % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
