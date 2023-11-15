package src.week_10.assignment.Question_10_22;

public class Tets {

    public static void main(String[] args) {

       char[] array = {'I', 'N', 'A', 'R'};

       MyString1 s = new MyString1(array);

        System.out.println(s.toString());

        MyString1 s1 = s.toLowerCase();

        System.out.println(s1.toString());

        MyString1 s2 = s1.substring(0, 2);

        System.out.println(s2.toString());

        System.out.println(s2.length());

        System.out.println(s.equals(s2));

        System.out.println(s.equals(s1));

        MyString1 s3 = s.valueOf(65913);

        System.out.println(s3.toString());

    }
}
