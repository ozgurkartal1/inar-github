package src.week_06.assignment;

public class Question_06_11 {

    public static void main(String[] args) {

        System.out.println("SalesAmount\t\tCommission");
        System.out.println("---------------------------");

        for (float i = 10000.0f; i <= 100000.0f ; i += 5000.0f) {
            double commission = computeCommission(i);
            System.out.printf("%1d\t\t\t\t%.1f\n",(int) i, commission);
        }
    }

    public static double computeCommission(double salesAmount) {
       double commission = 0;
        if(salesAmount < 5000){
            commission = salesAmount * 0.08;
        } else if (salesAmount < 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else{
            commission = 5000 * 0.08 + (10000 - 5000) * 0.10 + (salesAmount - 10000) * 0.12;
        }

        return commission;
    }
}
