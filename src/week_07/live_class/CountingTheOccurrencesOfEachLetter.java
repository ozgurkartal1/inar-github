package src.week_07.live_class;

public class CountingTheOccurrencesOfEachLetter {

    public static void main(String[] args) {

        char[] letters = getCharArray();

        int[] count = getCountArray(letters);

        System.out.println("The lowercase letters are : ");

        printArray(letters);

        System.out.println("\nThe occurrences of each letter are : ");

        printArray(count);

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " + (char)(i + 'a') + " ");
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    public static void printArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    private static int[] getCountArray(char[] letters) {
        int[] array = new int[26];

        for (int i = 0; i < array.length; i++) {
            for (char ch : letters) {
                if(ch == (i + 'a')){
                    array[i]++;
                }
            }
        }
        return array;
    }

    private static char[] getCharArray() {
        char[] array = new char[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomLowerCaseLetter();
        }
        return array;
    }

    public static char getRandomCharacter(char ch1, char ch2){
        char ch = (char)(Math.min(ch1, ch2));
        return (char)(Math.random() * (Math.abs(ch2 - ch1) + 1) + ch);
    }

    private static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
}
