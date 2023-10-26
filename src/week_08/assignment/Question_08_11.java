package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a number between 0 and 511 : ");

        int number = input.nextInt();

        char[][][] array = facesOfCoins();

        print(array, number);

    }
    public static char[][][] facesOfCoins(){

        int[][][] matrix = getThreeDimensionalArray();

        char[][][] result = new char[512][3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < result[0][0].length; k++) {
                    if(matrix[i][j][k] == 0){
                        result[i][j][k] = 'H';
                    }else{
                        result[i][j][k] = 'T';
                    }
                }
            }
        }

        return result;
    }

    public static int[][][] getThreeDimensionalArray() {

        int[][][] result = new int[512][3][3];

        int count = 0;

        while(count < 512) {

            for (int i = 0; i < result[0].length; i++) {
                for (int j = 0; j < result[0][0].length; j++) {
                    result[count][i][j] = (int)(Math.random() * 2);
                }
            }

            if(!isEquals(result, count)){
                count++;
            }

        }

        return result;
    }
    public static boolean isEquals(int[][][] result, int count) {
        boolean st = false;

        for (int i = 0; i < count; i++) {
            st = true;
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < result[0][0].length; k++) {
                    if(result[count][j][k] != result[i][j][k]){
                        st = false;
                        break;
                    }
                }
                if (!st) {
                    break;
                }
            }
            if(st){
                return st;
            }
        }

        return st;
    }
    public static void print(char[][][] array, int number) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0][0].length; j++) {
                System.out.print(array[number][i][j] + " ");
            }
            System.out.println();
        }
    }
}
