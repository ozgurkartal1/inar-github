package src.week_11.assignment.question_05;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students;

    private int numberOfStudents;

    public Course(String courseName){
        students = new ArrayList<>();
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }

    public void dropStudents(String student){
        if(!students.isEmpty()){
            students.remove(student);
            numberOfStudents--;
        }
    }

    public String toString(){
        String str = "";
        for (String s : students){
            str += s + " - ";
        }

        return str;
    }
}
