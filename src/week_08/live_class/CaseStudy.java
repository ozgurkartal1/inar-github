package src.week_08.live_class;

public class CaseStudy {

    public static void main(String[] args) {

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        char[][] answers = new char[8][9];

        initiliazeMatrix(answers);

        for (int i = 0; i < answers.length; i++) {
            System.out.print("Student " + i);
            for (int j = 0; j < answers[0].length; j++) {
                System.out.print("\t" + answers[i][j]);
            }

            System.out.println();
        }

        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < answers.length; i++) {
            System.out.println("Student " + (i + 1) + " : " +
                    getCountOfCorrectAnswers(i, answers, key) + " correct answers");
        }

    }

    private static int getCountOfCorrectAnswers(int i, char[][] answers, char[] key) {
        int count = 0;

        for (int j = 0; j < answers[0].length; j++) {
            if (answers[i][j] == key[j]) {
                count++;
            }
        }

        return count;

    }

    private static void initiliazeMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (char) (Math.random() * ('E' - 'A' + 1) + 'A');
            }
        }
    }
}
