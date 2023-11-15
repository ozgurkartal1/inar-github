package src.week_11.assignment.question_02;

public class Student extends Person{
    private final int status;

    public Student(int status){
        this.status = status;
    }

    public Student(int status, String name, String address,
                   String phoneNumber, String emailAddress) {

        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClass Status : " + status;
    }
}
