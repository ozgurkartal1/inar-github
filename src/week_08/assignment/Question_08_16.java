package src.week_08.assignment;

public class Question_08_16 {

    public static void main(String[] args) {

        int[][] list = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort(list);

        print(list);
    }

    public static void print(int[][] matrix){
        for (int[] ints : matrix){
            for (int i : ints){
                System.out.print(i + " ");
            }
        }
    }

    public static void sort(int[][] list) {
        int low = 0;
        int high = list.length - 1;

        while (low < high){

            int index = findIndex(list, low);

            int temp1 = list[low][0];
            list[low][0] = list[index][0];
            list[index][0] = temp1;

            int temp2 = list[low][1];
            list[low][1] = list[index][1];
            list[index][1] = temp2;

            low++;
        }
    }

    public static int findIndex(int[][] list, int low) {
        int min = list[low][0];
        int index = low;

        for (int i = low + 1; i < list.length; i++) {

            if(list[i][0] < min){
                min = list[i][0];
                index = i;
            }
            else if(list[i][0] == min){
                if(list[i][1] < list[index][1]){
                    index = i;
                }
            }
        }

        return index;
    }
}
