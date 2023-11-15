package src.week_10.assignment.Question_10_02;

public class BMI {

    private String name;
    private int age;
    private double weight;

    private double feet;

    private double inches;

    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    public double calculateBMI(){
        double height = 12 * feet + inches;
        double bmi = (weight * KILOGRAMS_PER_POUND) / (Math.pow((height * METERS_PER_INCH), 2));

        return  Math.round(bmi * 100) / 100.0;
    }

    public String getStatus(){
        double bmi = calculateBMI();

        if(bmi < 18.5){
            return "Underweight";
        }
        if(bmi < 25){
            return "Normal";
        }

        if(bmi < 30){
            return "Overweight";
        }

        return "obese";
    }

}
