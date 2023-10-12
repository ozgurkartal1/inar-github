package src.week_07.assignment;

public class Question_07_07 {

    public static void main(String[] args) {

        int[] array = getArray();

        System.out.println("Count for each number between 0 and 9 : ");

        int[] countArray = getCountArray(array);

        printArray(array);

        System.out.println();

        printCountArray(countArray);
    }

    private static void printArray(int[] array){
        int count = 0;
        for (int i : array){
            System.out.print(i + " ");
            count++;

            if(count % 10 == 0){
                System.out.println();
            }
        }
    }

    private static void printCountArray(int[] countArray) {
        for(int i = 0 ; i < countArray.length; i++){
            System.out.println(i + "s:  " + countArray[i]);
        }
    }

    private static int[] getCountArray(int[] array) {
        int[] count = new int[10];
        for (int i : array){
            count[i]++;
        }
        return count;
    }

    private static int[] getArray() {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }

        return array;
    }
}
