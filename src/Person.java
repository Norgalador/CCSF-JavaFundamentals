// Base person class (parent or super)
public class Person {
    private String name;
    private String address;
    private String phone;

    // Default constructor
    public Person() {
    }
    // Constructor with fields
    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    // toString method for displaying output
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Telephone: " + phone + "\n";
    }
}
