package src.week_08.assignment;

public class Question_08_22 {

    public static void main(String[] args) {

        int[][] matrix = fillMatrix();

        print(matrix);

       if(isEvenNumberOf1sEveryRow(matrix)){
           System.out.println("Every row have an even number of 1s");
       }else {
           System.out.println("Every row does not have an even number of 1s");
       }


        if(isEvenNumberOf1sEveryColumn(matrix)){
            System.out.println("Every column have an even number of 1s");
        }else {
            System.out.println("Every column does not have an even number of 1s");
        }


    }

    public static boolean isEvenNumberOf1sEveryColumn(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int numberOf1s = calculateNumberOf1sInColumns(i, matrix);

            if(numberOf1s % 2 != 0){
                return false;
            }
        }

        return true;
    }

    public static int calculateNumberOf1sInColumns(int i, int[][] matrix) {
        int count = 0;
        for (int[] ints : matrix) {
            if (ints[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static int calculateNumberOf1sInRows(int i, int[][] matrix) {
        int count = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 1){
                count++;
            }
        }

        return count;
    }


    public static boolean isEvenNumberOf1sEveryRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int numberOf1s = calculateNumberOf1sInRows(i, matrix);

            if(numberOf1s % 2 != 0){
                return false;
            }
        }

        return true;
    }

    public static void print(int[][] matrix) {
        for(int[] ints : matrix){
            for (int i : ints){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillMatrix() {
        int[][] result = new int[6][6];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }

        return result;
    }
}
