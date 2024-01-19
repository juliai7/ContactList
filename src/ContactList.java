import java.util.ArrayList;
import java.util.Scanner;

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
    public void printContacts() {
        for (Person person : contacts) {
            System.out.println(person);
        }
    }
    public void sort(int sortBy) {
        int size = contacts.size();
        if (sortBy == 0) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; i++) {
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j+1).getFirstName()) > 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(contacts.get(j+1), temp);
                    }
                }
            }
        }
        else if (sortBy == 0) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; i++) {
                    if (contacts.get(j).getLastName().compareTo(contacts.get(j+1).getLastName()) > 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(contacts.get(j+1), temp);
                    }
                }
            }
        }
        else if (sortBy == 2) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; i++) {
                    if (contacts.get(j).getPhoneNumber().compareTo(contacts.get(j+1).getPhoneNumber()) > 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(contacts.get(j+1), temp);
                    }
                }
            }
        }
    }
    public Person searchByFirstName(String firstName) {
        for (Person person : contacts) {
            if (person.getFirstName().equals(firstName)) {
                return person;
            }
        }
        return null;
    }
    public Person searchByLastName(String lastName) {
        for (Person person : contacts) {
            if (person.getFirstName().equals(lastName)) {
                return person;
            }
        }
        return null;
    }
    public Person searchByPhoneNumber(String phoneNumber) {
        for (Person person : contacts) {
            if (person.getFirstName().equals(phoneNumber)) {
                return person;
            }
        }
        return null;
    }
    public String listStudents() {
        for (Person person : contacts) {
            if (person instanceof Student) {
                return person;
            }
        }
    }

    public void run() {
        System.out.println("Menu: \n1. Add Contact \n2. List All Contacts By First Name\n" +
                "3. List All Contacts By Last Name\n4. List All Contacts by Phone Number\n" +
                "6. Search By First Name\n7. Search By Last Name\n8. Search By Phone Number\n0. Exit");
        Scanner scan = new Scanner(System.in);
        String input = new
    }

}
