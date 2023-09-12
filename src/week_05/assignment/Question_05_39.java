package src.week_05.assignment;

public class Question_05_39 {

    public static void main(String[] args) {

        double baseSalary = 5000;
        double salesAmount = 0;
        double commission = 0;


        while(commission + baseSalary < 30000){

            commission = 0;

            if(salesAmount <= 5000){
                commission += salesAmount * 0.08;
            } else if (salesAmount <= 10000) {
                commission += 5000 * 0.08 + (salesAmount - 5000) * 0.10;
            }else{
                commission += 5000 * 0.08 + (10000 - 5000) * 0.10 + (salesAmount - 10000) * 0.12;
            }
            salesAmount += 0.01;
        }
        System.out.printf("Minimum sales to earn $30000 : %.2f", salesAmount);
    }
}
