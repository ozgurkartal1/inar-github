package src.week_09.live_class;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person("Ozgur", "Kartal", "123", false, 27);

        System.out.println(person.id);

        Person person1 = new Person("xyz", "abc", "345", false, 30);

        System.out.println(person1.getFullName());

        Person person2 = new Person();



    }
}
