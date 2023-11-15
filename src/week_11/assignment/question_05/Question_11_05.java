package src.week_11.assignment.question_05;

public class Question_11_05 {

    public static void main(String[] args) {

        Course course = new Course("Math");

        course.addStudent("Nisanur Altuntas");
        course.addStudent("Gurkan SERTESER");
        course.addStudent("Sinan Cetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Denis");
        course.addStudent("Berkan Eris");

        System.out.println("After adding student to the course : ");

        System.out.println(course.toString());
        System.out.println(course.getNumberOfStudents());

        System.out.println("---------------------------------------------");

        course.dropStudents("Sinan Cetin");
        course.dropStudents("Mehmet Toprak");
        course.dropStudents("Berkan Eris");

        System.out.println("After dropping student from the course : ");

        System.out.println(course.toString());
        System.out.println(course.getNumberOfStudents());
    }
}
