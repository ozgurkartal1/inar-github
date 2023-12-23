package week_13.assignmet.question_13_13;

public class Question_13_13 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Course course1 = new Course("Math");

        course1.addStudent("Mehmet");
        course1.addStudent("Taha");

        System.out.println(course1.getStudents());

        Course course2 = course1.clone();

        System.out.println(course2.getStudents());
        System.out.println("-------------------------");

        course1.dropStudent("Taha");
        course2.addStudent("Ozgur");

        System.out.println(course1.getStudents());
        System.out.println(course2.getStudents());
    }
}
