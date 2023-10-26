package src.week_08.assignment;

public class Question_08_07 {

    public static void main(String[] args) {

        double[][] points = {{-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        int index1 = 0;
        int index2 = 0;
        double min = calculateDistance(0, 1, points);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {

                double distance = calculateDistance(i, j, points);

                if(distance < min){
                    min = distance;
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println("The closest two points are (" +
                points[index1][0] + ", " + points[index1][1] + ", " + points[index1][2] + ") and (" +
                points[index2][0] + ", " + points[index2][1] + ", " + points[index2][2] + ")");

    }

    public static double calculateDistance(int i, int j, double[][] m) {
        double result = 0;
        for (int k = 0; k < m[i].length; k++) {
            result += (m[j][k] - m[i][k]) * (m[j][k] - m[i][k]);
        }

        return Math.sqrt(result);
    }


}
