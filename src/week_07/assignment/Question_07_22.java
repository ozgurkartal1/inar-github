package src.week_07.assignment;

public class Question_07_22 {

    public static void main(String[] args) {

        char[] queens = placeQueens();
        print(queens);
    }

    public static char[] placeQueens() {
       int countOfInvalidRandomNumbers = 0;
       int[] indexes;
       char[] queens = new char[0];
       
       boolean st = true;
       
       while(st){
           st = false;
           int countOfIndexes = 0;
           indexes = new int[8];
           queens = new char[64];
           
           do{
               int index = (int)(Math.random() * 8) + (8 * countOfIndexes); 
               indexes[countOfIndexes] = index;
               
               if(isValidPlacement(index, countOfIndexes, indexes)){
                   queens[index] = 'Q';
                   countOfIndexes++;
                   countOfInvalidRandomNumbers = 0;
               }else{
                   countOfInvalidRandomNumbers++;
               }
               
               if(countOfInvalidRandomNumbers > 100){
                   st = true;
                   break;
               }

           }while(countOfIndexes != 8);
       }

        for (int i = 0; i < queens.length; i++) {
            if(queens[i] != 'Q'){
                queens[i] = ' ';
            }
        }
       
       return queens;
               
    }

    public static boolean isInTheSameColumn(int index, int count, int[] indexes){
        int column = getColumn(index);
        for (int i = 0; i < count; i++) {
            if (column == getColumn(indexes[i])) {
                return false;
            }
        }

        return true;
    }

    public static int getColumn(int index) {
        return index % 8;
    }

    public static boolean isOnTheSameDiagonal(int index, int count, int[] indexes){
        for (int i = 0; i < count; i++) {
            int row = indexes[i] / 8;
            int column = getColumn(indexes[i]);

            int tempRow = row;
            int tempColumn = column;

            while(tempRow <= 7 && tempColumn <= 7){
                if (tempRow == index / 8 && tempColumn == index % 8) {
                    return false;
                }
                tempRow++;
                tempColumn++;
            }

            tempRow = row;
            tempColumn = column;

            while(tempRow >= 0 && tempColumn >= 0){
                if (tempRow == index / 8 && tempColumn == index % 8) {
                    return false;
                }
                tempRow--;
                tempColumn--;
            }

            tempRow = row;
            tempColumn = column;

            while(tempRow >= 0 && tempColumn <= 7){
                if (tempRow == index / 8 && tempColumn == index % 8) {
                    return false;
                }
                tempRow--;
                tempColumn++;
            }

            tempRow = row;
            tempColumn = column;

            while(tempRow <= 7 && tempColumn >= 0){
                if (tempRow == index / 8 && tempColumn == index % 8) {
                    return false;
                }
                tempRow++;
                tempColumn--;
            }
        }

        return true;
    }


    public static boolean isValidPlacement(int index, int count, int[] indexes) {
        boolean isOnTheSameColumn = isInTheSameColumn(index, count, indexes);
        boolean isOnTheSameDiagonal = isOnTheSameDiagonal(index, count, indexes);

        return isOnTheSameColumn && isOnTheSameDiagonal;
    }

    public static void print(char[] queens) {
        for (int i = 0; i < queens.length; i++) {
            if ((i + 1) % 8 != 0) {
                System.out.print("|" + queens[i]);
            } else {
                System.out.println("|" + queens[i] + "|");
            }
        }
    }
}
