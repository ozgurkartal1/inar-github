package src.week_06.assignment;

public class Question_06_12 {

    public static void main(String[] args) {

        int charPerLine = 10;
        char firstChar = '1';
        char lastChar = 'Z';

        printChars(firstChar,lastChar,charPerLine);
    }

    public static void printChars(char ch1, char ch2, int charPerLine) {

        int count = 0;

        for (int i = ch1; i <= ch2 ; i++) {
            System.out.print((char)(i) + " ");
            count++;

            if(count % charPerLine == 0){
                System.out.println();
            }
        }
    }
}
