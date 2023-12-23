package week_13.assignmet.question_13_12;


public class Question_12_11 {

    public static void main(String[] args) throws Exception {

        GeometricObject[] geos = new GeometricObject[4];

        geos[0] = new Circle(5);
        geos[1] = new Circle(12);
        geos[2] = new Rectangle(15, 12);
        geos[3] = new Rectangle(25, 13);


        System.out.println("Total area of the geometric objects : " +
                sumArea(geos));
    }

    public static double sumArea(GeometricObject[] geos) {
        double sum = 0;
        for (GeometricObject geo : geos){
            sum += geo.getArea();
        }

        return sum;
    }
}
