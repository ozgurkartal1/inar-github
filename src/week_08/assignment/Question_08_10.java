package src.week_08.assignment;

public class Question_08_10 {

    public static void main(String[] args) {

        int[][] matrix = getMatrix();

        print(matrix);

        int rowIndex = findTheFirstRowWithMax1s(matrix);

        int columnIndex = findTheFirstColumnWithMax1s(matrix);

        System.out.println("The largest row index : " + rowIndex);
        System.out.println("The largest column index : " + columnIndex);
    }

    public static void print(int[][] m){
        for (int[] i : m){
            for (int j : i){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static int findTheFirstColumnWithMax1s(int[][] matrix) {
        int column = 0;
        int max = -1;

        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int[] j: matrix) {
                if(j[i] == 1){
                    count++;
                }
            }

            if(count > max){
                max = count;
                column = i;
            }
        }

        return column;
    }

    private static int findTheFirstRowWithMax1s(int[][] matrix) {
        int row = 0;
        int max = -1;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1){
                    count++;
                }
            }

            if(count > max){
                max = count;
                row = i;
            }
        }

        return row;
    }

    public static int[][] getMatrix() {
        int[][] result = new int[4][4];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = (int)(Math.random() * 2);
            }
        }

        return result;
    }
}
