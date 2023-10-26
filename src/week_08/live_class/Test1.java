package src.week_08.live_class;

public class Test1 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i].length * i + j;
            }
        }

        print(array);
    }

    public static void print(int[][] array) {
        for (int[] i : array) {
            for (int j : i){
                System.out.printf("%2d ", j);
            }

            System.out.println();
        }
    }
}
