package week_13.assignmet.question_13_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(double radius) throws Exception {
        super(radius);
    }

    public ComparableCircle(boolean isFilled, String color, double radius) throws Exception {
        super(isFilled, color, radius);
    }

    public String toString(){
        return super.toString();
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }

        if(getRadius() == o.getRadius()){
            return 0;
        }

        return -1;
    }
}
