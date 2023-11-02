package src.week_09.assignment.Question_09_02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercentage(){
        return (currentPrice - previousClosingPrice) * 100 / previousClosingPrice;
    }

    void setPreviousClosingPrice(double p){
        previousClosingPrice = p;
    }

    void setCurrentPrice(double c){
        currentPrice = c;
    }
}
