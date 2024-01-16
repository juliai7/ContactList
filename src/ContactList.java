import java.util.ArrayList;
public class ContactList {
    private ArrayList<Person> contacts;

    public ContactList() {
        contacts = new ArrayList<Person>();
    }
    public ArrayList<Person> getContacts() {
        return contacts;
    }
    public void addContact(Person other) {
        contacts.add(other);
    }
    public String printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            return contacts.get(i);
        }
    }
    public void sort(int sortBy) {
        if (sortBy = 0) {

        }
    }

}
