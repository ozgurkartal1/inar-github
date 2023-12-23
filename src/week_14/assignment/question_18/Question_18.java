package week_14.assignment.question_18;

public class Question_18 {

    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();

        contactManager.addContact("Ozgur", "232-235-564");
        contactManager.addContact("Kartal", "456-343-256");

        System.out.println(contactManager.searchByName("Ozgur"));
        System.out.println(contactManager.searchByPhoneNumber("456-343-256"));
    }
}
