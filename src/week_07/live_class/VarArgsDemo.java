package src.week_07.live_class;

public class VarArgsDemo {

    public static void main(String[] args) {

        printMax(34, 3, 3, 2, 56.5);

        double[] array = {1, 2, 3};

        printMax(array);
    }

    private static void printMax(double... numbers) {
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double max = numbers[0];

        for (double number : numbers){
            if(number > max){
                max = number;
            }
        }
        System.out.println("The max value is " + max);
    }
}
