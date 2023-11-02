package src.week_09.assignment.Question_09_13;

public class Location {
    int row;
    int column;
    double maxValue;

    Location(){

    }

    Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }



    double[] getMaxValue(double[][] array){
        double[] maxValue = new double[3];
        double max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    maxValue[0] = max;
                    maxValue[1] = i;
                    maxValue[2] = j;
                }
            }
        }

        return maxValue;
    }

}
