public class Parent extends Person{
    private String childName;
    public Birthday(String firstName, String lastName, String phoneNumber, String childName) {
        super(firstName, lastName, phoneNumber);
        this.childName =  childName;
    }

    public String getChildName() {
        return childName;
    }
    public String toString() {
        return super.toString() + " " + childName;
    }
}
