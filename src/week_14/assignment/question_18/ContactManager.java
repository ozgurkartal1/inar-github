package week_14.assignment.question_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContactManager {

    private Map<String, String> contacts;

    ContactManager(){
        contacts = new HashMap<>();
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public void addContact(String name, String phoneNumber){
        contacts.put(name, phoneNumber);
    }

    public String searchByName(String name){
        return contacts.get(name);
    }

    public String searchByPhoneNumber(String phoneNumber){
        String s = "";
        Set<String> key = contacts.keySet();

        for (String string : key) {
            if(contacts.get(string).equals(phoneNumber)){
                s = string;
                break;
            }
        }
        return s;
    }
}
