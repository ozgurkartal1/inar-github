package src.week_08.assignment;

import java.util.Scanner;

public class Question_08_36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n : ");
        int n = input.nextInt();

        System.out.println("Enter " +  n + " rows of letters separated by spaces : ");

        char[][] array = new char[n][n];

        int i = 0;

        do {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.next().charAt(0);
            }

            i++;

        }while (isLatinSquare(array, (i - 1)) && i < array.length);

        if(isLatinSquare(array, array.length - 1)){
            System.out.println("The input array is a Latin square");
        }else{
            System.out.println("Wrong input : the letters must be from " +
                    "A to " + (char)('A' + n - 1));
        }

    }
    public static boolean isLatinSquare(char[][] array, int i) {
        for (int j = 0; j < array[0].length; j++) {
            if(array[i][j] < 'A' || array[i][j] > 'Z'){
                return false;
            }
        }

        for(int j = 0 ; j < array[0].length ; j++){
            if(array[i][j] >= 'A' + array.length){
                return false;
            }
        }

        return true;
    }
}
