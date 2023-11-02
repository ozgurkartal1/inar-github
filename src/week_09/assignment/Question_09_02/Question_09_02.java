package src.week_09.assignment.Question_09_02;

public class Question_09_02 {

    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("Stock name : " + stock.name);
        System.out.println("Stock symbol : " + stock.symbol);
        System.out.println("Price Change Percentage : " + stock.getChangePercentage());

    }
}
