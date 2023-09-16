package src.week_06.live_class;

public class maxMethod {

    public static void main(String[] args) {

        int maxNumber = max(8,10);
        System.out.println(maxNumber);

        maxNumber = max(15,13);
        System.out.println(maxNumber);

    }
    public static int max (int n1, int n2){
        int max = 0;
        if(n1 > n2){
            return n1;
        }else {
            return n2;
        }

    }
}
