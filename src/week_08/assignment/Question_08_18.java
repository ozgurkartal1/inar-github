package src.week_08.assignment;

public class Question_08_18 {

    public static void main(String[] args) {

        int[][] m = {{1 ,2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        print(m);
    }

    public static void print(int[][] m){
        for (int[] ints : m){
            for (int i : ints){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int row = (int)(Math.random() * m.length);

            for (int j = 0; j < m[0].length; j++) {
                int temp = m[i][j];
                m[i][j] = m[row][j];
                m[row][j] = temp;
            }
        }
    }
}
