package week_13.assignmet.question_13_13;

import java.util.ArrayList;

public class Course implements Cloneable{

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    public Course(){
    }
    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void addStudent(String student){
        students.add(student);
    }

    public void dropStudent(String student){
        students.remove(student);
    }

    @Override
    public Course clone() throws CloneNotSupportedException {
        Course courseClone = (Course) super.clone();
        courseClone.students = (ArrayList<String>) students.clone();
        return courseClone;
    }
}
