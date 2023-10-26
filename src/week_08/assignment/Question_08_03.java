package src.week_08.assignment;

public class Question_08_03 {

    public static void main(String[] args) {

        char[][] answersOfStudents =
                {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] correctAnswers = new int[answersOfStudents.length];

        for (int i = 0; i < answersOfStudents.length; i++) {
            for (int j = 0; j < answersOfStudents[i].length; j++) {
                if(answersOfStudents[i][j] == key[j]){
                    correctAnswers[i]++;
                }
            }
        }

        int[] sorted = sort(correctAnswers);

        int[] previousIndexes = new int[correctAnswers.length];


        for (int i = 0 ; i < sorted.length ; i++){
            for(int j = 0 ; j < correctAnswers.length ; j++){
                if(sorted[i] == correctAnswers[j] && isPreviousIndex(previousIndexes, i, j)){
                    System.out.println("Student " + j + "'s correct count is " + sorted[i]);
                    previousIndexes[i] = j;
                    break;
                }
            }
        }
    }

    public static boolean isPreviousIndex(int[] m, int i, int j) {
        for (int k = 0; k < i; k++) {
            if(m[k] == j){
                return false;
            }
        }

        return true;
    }

    public static int[] sort(int[] list) {
        int low = 0;
        int high = list.length - 1;
        int[] result = copyArray(list);

        while (high > low){
            int min = result[low];
            int index = low;

            for (int i = low + 1; i <= high ; i++) {
                if(result[i] < min){
                    min = result[i];
                    index = i;
                }
            }

            int temp = result[low];
            result[low] = min;
            result[index] = temp;

            low++;
        }

        return result;
    }

    public static int[] copyArray(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = list[i];
        }

        return result;
    }
}
