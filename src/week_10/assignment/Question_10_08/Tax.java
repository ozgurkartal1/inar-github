package src.week_10.assignment.Question_10_08;

public class Tax {

    private int filingStatus;
    private int[][] brackets;

    private double[] rates;
    private double taxableIncome;

    Tax(){

    }

    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public double getTax(){
        double tax = 0;
        int previousValue = 0;

        for (int i = 0; i < rates.length; i++) {
            if(i < brackets[0].length){
                if(taxableIncome > brackets[filingStatus][i]){
                    tax += (brackets[filingStatus][i] - previousValue) * rates[i];
                    previousValue = brackets[filingStatus][i];
                }else{
                    tax += (taxableIncome - previousValue) * rates[i];
                    break;
                }
            }else{
                tax += (taxableIncome - previousValue) * rates[i];
            }

        }

        return tax;
    }


}
