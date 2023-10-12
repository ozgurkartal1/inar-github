package src.week_07.live_class;

public class deneme {

    public static void main(String[] args) {

        int[] list = new int[100];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 8) + 8;
        }

        int[] count = createCountArray(list);

        displayingArray(count);
    }

    public static void displayingArray(int[] count) {
        for (int i = 0 ; i < count.length ; i++){
            System.out.println((i + 8) + ":" + count[i]);
        }
    }

    public static int[] createCountArray(int[] list) {
        int[] count = new int[8];

        for (int i : list){
            count[i- 8]++;
        }

        return count;
    }
}
