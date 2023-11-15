package src.week_10.live_class.example;
public class Course {
    private String courseName;
    private String[] students = new String[100];

    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String name){
        students[numberOfStudents++] = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }


}
