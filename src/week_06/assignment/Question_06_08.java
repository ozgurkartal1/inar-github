package src.week_06.assignment;

public class Question_06_08 {

    public static void main(String[] args) {

        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("-----------------------------------------------");

        for (float i = 40.0f; i > 30.0f ; i -= 1.0f) {
            System.out.printf("%.1f\t\t%.1f\t|\t",i, celsiusToFahrenheit(i));
            System.out.printf("%.1f\t\t%.2f\n",(10 * i - 280), fahrenheitToCelsius(10 * i - 280));
        }
    }

    public static double fahrenheitToCelsius(float fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusToFahrenheit(float celsius) {
        return (9.0 / 5) * celsius + 32;

    }
}
