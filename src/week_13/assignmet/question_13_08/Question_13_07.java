package week_13.assignmet.question_13_08;

public class Question_13_07 {

    public static void main(String[] args) throws CloneNotSupportedException {

        MyStack m1 = new MyStack();

        System.out.println("Pushing the number 4, 5, and 6 to 1st stack...");
        m1.push(4);
        m1.push(5);
        m1.push(6);

        System.out.println("Cloning 1st stack...");

        MyStack m2 = (MyStack) m1.clone();

        System.out.println("Popping object from 1st stack...");
        m1.pop();

        System.out.println("1st " + m1.toString());
        System.out.println("2st " + m2.toString());

        System.out.println("Is the 1st stack equal to the 2nd stack ->> " +
                m1.equals(m2));


    }
}
