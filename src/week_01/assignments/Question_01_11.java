package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] args) {
        double currentPopulation = 312032486;
        int variable = 365 * 24 * 3600;
        double year1Population = currentPopulation + (variable / 7.0) - (variable / 13.0) + (variable / 45.0);
        double year2Population = year1Population + (variable / 7.0) - (variable / 13.0) + (variable / 45.0);
        double year3Population = year2Population + (variable / 7.0) - (variable / 13.0) + (variable / 45.0);
        double year4Population = year3Population + (variable / 7.0) - (variable / 13.0) + (variable / 45.0);
        double year5Population = ((year4Population + (variable) / 7.0)) - (variable / 13.0) + (variable / 45.0);
        System.out.println("Population Projection");
        System.out.println("Current Population: 312032486");
        System.out.println("One birth every 7 seconds");
        System.out.println("One new immigrant every 45 seconds");
        System.out.println("Yearly Population projection formula: ");
        System.out.println("Current population + ((births per year)");
        System.out.println("                   - (deaths per year)");
        System.out.println("                   + (new immigrants per year))");
        System.out.println("Year 1 projection: ");
        System.out.println(year1Population);
        System.out.println("Year 2 projection: ");
        System.out.println(year2Population);
        System.out.println("Year 3 projection: ");
        System.out.println(year3Population);
        System.out.println("Year 4 projection: ");
        System.out.println(year4Population);
        System.out.println("Year 5 projection: ");
        System.out.println(year5Population);
    }
}
