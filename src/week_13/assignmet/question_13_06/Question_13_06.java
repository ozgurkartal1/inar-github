package week_13.assignmet.question_13_06;

public class Question_13_06 {

    public static void main(String[] args) throws Exception {

        ComparableCircle c1 = new ComparableCircle(true, "blue", 16.5);

        ComparableCircle c2 = new ComparableCircle(true, "purple", 20.3);

        System.out.println("ComparableCircle1 :\n" + c1.toString());
        System.out.println("----------------------------------");
        System.out.println("ComparableCircle2 :\n" + c2.toString());
        System.out.println("-------------------------------------");

        if(c1.compareTo(c2) > 0){
            System.out.println("ComparableCircle1 is the larger of the two Circles");
        }else if(c1.compareTo(c2) == 0){
            System.out.println("Two circle is equal ");
        }else{
            System.out.println("ComparableCircle2 is the larger of the two Circles");
        }

    }
}
