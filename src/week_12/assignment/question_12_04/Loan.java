package week_12.assignment.question_12_04;

import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    private Date loanDate;

    public Loan(){
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate <= 0){
            throw new IllegalArgumentException("Please greater than 0(zero)");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if(numberOfYears <= 0){
            throw new IllegalArgumentException("Please greater than 0(zero)");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0){
            throw new IllegalArgumentException("Please greater than 0(zero)");
        }
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(){
        double  monthlyInterestRate = annualInterestRate  / 1200;
        return  loanAmount * monthlyInterestRate  /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
