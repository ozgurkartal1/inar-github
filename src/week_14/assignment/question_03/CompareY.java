package week_14.assignment.question_03;

import java.util.Comparator;

public class CompareY extends Point implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        if(Double.compare(o1.getY(), o2.getY()) == 0){
            return Double.compare(o1.getX(), o2.getX());
        }
        return Double.compare(o1.getY(), o2.getY());
    }
}
