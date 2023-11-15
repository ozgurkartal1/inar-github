package src.week_10.live_class.example;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Course course = new Course("Math");

        course.addStudent("Ozgur");
        course.addStudent("Ozge");
        course.addStudent("Ekin");

        String[] array = course.getStudents();

        System.out.println("Number of " + course.getCourseName() +
                 " Students : " + course.getNumberOfStudents());

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n-------------------------------------------");

        Course course2 = new Course("Computer Science");

        course2.addStudent("Ayse");
        course2.addStudent("Aslı");
        course2.addStudent("Nazire");

         array = course2.getStudents();

        System.out.println("Number of " + course2.getCourseName() +
                " Students : " + course2.getNumberOfStudents());

        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(array[i] + " ");
        }


    }
}
