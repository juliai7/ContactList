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
                        contacts.set(j+1, temp);
                    }
                }
            }
        }
        else if (sortBy == 1) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; i++) {
                    if (contacts.get(j).getLastName().compareTo(contacts.get(j+1).getLastName()) > 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(j+1, temp);
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
                        contacts.set(j+1, temp);
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
    public void listStudents() {
        for (Person person : contacts) {
            if (person instanceof Student) {
                System.out.println(person.toString());
            }
        }
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        int input = 11;
        while (input != 0) {
            System.out.println("Menu: \n1. Add Contact \n2. List All Contacts By First Name\n" +
                    "3. List All Contacts By Last Name\n4. List All Contacts by Phone Number\n" +
                    "6. Search By First Name\n7. Search By Last Name\n8. Search By Phone Number\n0. Exit");
            input = scan.nextInt();
            scan.nextLine();
            if (input == 1) {
                System.out.println("\nSelect a type of contact to add:" +
                        "\n1. Student\n2. Parent");
                int type = scan.nextInt();
                scan.nextLine();
                System.out.println("Please fill in the following information.\nFirst Name:");
                String firstName = scan.nextLine();
                System.out.println("Last Name:");
                String lastName = scan.nextLine();
                System.out.println("Phone Number:");
                String phoneNumber = scan.nextLine();
                if (type == 1) {
                    System.out.println("Grade:");
                    int grade = scan.nextInt();
                    scan.nextLine();
                    Student s = new Student(firstName, lastName, phoneNumber, grade);
                    addContact(s);
                } else {
                    System.out.println("Child Name: ");
                    String childName = scan.nextLine();
                    Parent p = new Parent(firstName, lastName, phoneNumber, childName);
                    addContact(p);
                }
            } else if (input == 2) {
                sort(0);
                for (Person p : contacts) {
                    System.out.println(p.getFirstName());
                }
            } else if (input == 3) {
                sort(1);
                for (Person p : contacts) {
                    System.out.println(p.getLastName());
                }
            } else if (input == 4) {
                sort(2);
                for (Person p : contacts) {
                    System.out.println(p.getPhoneNumber());
                }
            } else if (input == 5) {
                listStudents();
            } else if (input == 6) {
                System.out.println("Enter a name: ");
                String inputFirst = scan.nextLine();
                if (searchByFirstName(inputFirst) != null) {
                    System.out.println(searchByFirstName(inputFirst));
                } else {
                    System.out.println(inputFirst + " is not in the list.\nPlease choose from the menu.");
                    input = scan.nextInt();
                    scan.nextLine();

                }
            } else if (input == 7) {
                System.out.println("Enter a last name: ");
                String inputLast = scan.nextLine();
                if (searchByLastName(inputLast) != null) {
                    System.out.println(searchByLastName(inputLast));
                } else {
                    System.out.println(inputLast + " is not in the list.\nPlease choose from the menu.");
                    input = scan.nextInt();
                    scan.nextLine();
                }
            } else if (input == 8) {
                System.out.println("Enter a phone number: ");
                String inputNumber = scan.nextLine();
                if (searchByPhoneNumber(inputNumber) != null) {
                    System.out.println(searchByPhoneNumber(inputNumber));
                } else {
                    System.out.println(inputNumber + " is not in the list.\nPlease choose from the menu.");
                    input = scan.nextInt();
                    scan.nextLine();
                }
            } else if (input == 0) {
                break;
            }
            else {
                System.out.println("Invalid choice. Please choose a number listed");
                input = scan.nextInt();
                scan.nextLine();
            }
        }
    }

}
