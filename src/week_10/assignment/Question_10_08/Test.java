package src.week_10.assignment.Question_10_08;

public class Test {

    public static void main(String[] args) {

        int[][] bracket = {{8350, 33950, 82250, 171_550, 372_950},
                {16700, 67900, 137_050, 208_850, 372_959},
                {8350, 33959, 68525, 104_425, 186_475},
                {11950, 45500,117_450, 190_200, 372_950}};

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};


        System.out.println("\t\t\t\t\t2009 Taxes");
        System.out.print("Income\tStatus0\t\tStatus1\t\tStatus2\t\tStatus3\n");
        System.out.println("-----------------------------------------------------");

        for (int income = 50000; income <= 60000 ; income += 1000) {
            System.out.print(income + "\t");
            for (int status = 0; status < 4; status++) {
                Tax tax = new Tax(status, bracket, rates, income);
                System.out.printf("%8.2f\t", tax.getTax());
            }

            System.out.println();
        }
    }
}
