package src.week_06.assignment;

import java.util.Scanner;

public class Question_06_15 {

    public static void main(String[] args) {
        int status = 0;

        for (int taxableIncome = 50000; taxableIncome <= 60000 ; taxableIncome += 50) {
            int taxForStatus0 = (int)(Math.round(computeTax(0, taxableIncome)));
            int taxForStatus1 = (int)(Math.round(computeTax(1, taxableIncome)));
            int taxForStatus2 = (int)(Math.round(computeTax(2, taxableIncome)));
            int taxForStatus3 = (int)(Math.round(computeTax(3, taxableIncome)));

            System.out.println(taxableIncome + "\t\t" + taxForStatus0 + "\t\t" +
              taxForStatus1 + "\t\t" + taxForStatus2 + "\t\t" + taxForStatus3);
        }

    }

    public static double computeTax(int status, int taxableIncome) {
        if (status == 0 || status == 2) {
          return (8350 * 0.10) + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
        }
        if (status == 1){
          return 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
        }
        if (status == 3){
            return 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
        }
        return 0;
    }
}
