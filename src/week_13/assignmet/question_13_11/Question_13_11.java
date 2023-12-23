package week_13.assignmet.question_13_11;

public class Question_13_11 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Octagon octagon1 = new Octagon(5);
        System.out.println("Area : " + octagon1.getArea());
        System.out.println("Perimeter : " + octagon1.getPerimeter());

        System.out.println("\nCloning the Octagon...");
        Octagon octagon2 = octagon1.clone();

        if(octagon1.compareTo(octagon2) == 0){
            System.out.println("Octagon is equal to its clone ");
        }else{
            System.out.println("Octagon is not equal to its clone");
        }
    }
}
