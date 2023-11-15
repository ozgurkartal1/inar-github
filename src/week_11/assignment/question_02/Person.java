package src.week_11.assignment.question_02;

public class Person {
    private String name;
    private String address;

    private String phoneNumber;
    private String emailAddress;

    Person(){

    }
    Person(String name, String address, String phoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String toString(){
        return "Name : " + name +
               "\nAddress : " + address +
               "\nPhone Number : " + phoneNumber +
               "\nEmail Address : " + emailAddress;
    }
}
