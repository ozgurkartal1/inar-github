package src.week_10.assignment.Question_10_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];

    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
       String[] temp = students;
       students = new String[numberOfStudents + 1];
       students[numberOfStudents++] = student;
       if(numberOfStudents > 1) {
           System.arraycopy(temp, 0, students, 0, numberOfStudents - 1);
       }
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

    public boolean isEmptyCourse(){
        return numberOfStudents == 0;
    }
    public void dropStudent(String student){
        int index = getIndex(student);

        if(index == -1){
            System.out.println("This student is not in the course");
        }

        for (int i = index; i < students.length - 1; i++) {
            String temp = students[i];
            students[i] = students[i + 1];
            students[i + 1] = temp;
        }

        numberOfStudents--;

        String[] temp = new String[numberOfStudents];

        System.arraycopy(students, 0, temp, 0, temp.length);

        students = temp;
    }

    public void clear(){
        int number = numberOfStudents;
        while (!isEmptyCourse()){
            dropStudent(students[--number]);
        }
        numberOfStudents = number;
    }

    private int getIndex(String student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(student)){
                return i;
            }
        }

        return -1;
    }

    public void display(){
        for (String student : students) {
            System.out.println(student);
        }
    }
}
