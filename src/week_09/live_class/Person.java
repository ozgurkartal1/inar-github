package src.week_09.live_class;

public class Person {
    String name;
    String surname;
    String id;
    boolean isMarried;
    int age;

    Person(){}
    Person(String name, String surname, String id , boolean isMarried, int age){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.isMarried = isMarried;
        this.age = age;
    }

    public String getFullName(){
        return name + " " + surname;
    }
}
