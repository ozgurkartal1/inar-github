package week_01.assignments;

public class Question_01_12 {
    public static void main(String[] args) {
        double miles = 24.0;
        int seconds = 6035;
        double averageSpeedInKilometersPerHour = (miles * 1.6 * 3600) / seconds;
        System.out.println("Distance in miles: ");
        System.out.println(miles);
        System.out.println("Time in minutes");
        System.out.println(seconds / 60 + " minutes " + seconds % 60 + " seconds");
        System.out.println("Average speed in kilometers per hour");
        System.out.println(averageSpeedInKilometersPerHour);
    }
}
