package src.week_06.live_class;

public class Methods_02 {
    public static void main(String[] args) {

        int i = 5;
        int j = 2;
        int k = max(i,j);

        System.out.println("The maximum of " + i +
                " and " + j + " is " + k);


    }
    public static int max (int num1, int num2) {
        int max = 0;
        if (num1 > num2) {
            return num1;
        }
        if (num1 == num2) {
            return num1;
        }
        return num2;
    }
    public static int sign (int num1){
        if(num1 > 0){
            return 1;
        }
        if(num1 == 0){
            return 0;
        }
        return -1;
    }
}
