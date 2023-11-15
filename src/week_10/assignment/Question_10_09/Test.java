package src.week_10.assignment.Question_10_09;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Course course = new Course("Math");

        course.addStudent("Özgür Kartal");
        course.addStudent("Bilal Topal");
        course.addStudent("Ada Kaya");
        course.addStudent("Besim Karabıyık");
        course.addStudent("Emir Uyanık");


        course.display();

        System.out.println("---------------------------------------");

        course.dropStudent("Emir Uyanık");
        course.dropStudent("Bilal Topal");

        course.display();

        course.clear();

    }
}
