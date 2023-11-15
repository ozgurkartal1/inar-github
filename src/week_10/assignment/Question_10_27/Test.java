package src.week_10.assignment.Question_10_27;

public class Test {

    public static void main(String[] args) {

        MyStringBuilder str = new MyStringBuilder("La Casa De Papel--");

        System.out.println(str.toString());

        MyStringBuilder str1 = new MyStringBuilder("@El Profesor");

        str = str.append(str1);

        System.out.println(str.toString());

        str = str.append(4161);

        System.out.println(str.toString());

        str = str.toLowerCase();

        System.out.println(str.toString());

        str = str.substring(19, 30);

        System.out.println(str.toString());


    }
}
