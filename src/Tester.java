/**
 This program demonstrates a solution to the
 Inheritance assignment based on Person, Customer, and PreferredCustomer
 Program Main Class: Tester.java
 Programmer: Josh Burlile
 Date: 07/07/2023
 Description: A program that instantiates inherited classes simulating a database of customers
 */
public class Tester {
    public static void main(String[] args) {
        // Create two instances of the Person class and manipulate the fields of first instance
        Person p1 = new Person();
        Person p2 = new Person("Alex Matthew", "123 Bounty Drive", "123-445-1313");
        p1.setName("William James");
        p1.setAddress("1456 Edgewater Street");
        p1.setPhone("389-445-1312");
        // Show objects created in the console
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // Create two instances of the Customer class and manipulate the fields of first instance
        Customer c1 = new Customer();
        Customer c2 = new Customer("Xiao Xu", "67 Xiamen Sq", "530-213-5690", "234-D082", true);
        c1.setName("Julie James");
        c1.setCustomerNumber("147-A049");
        c1.setAddress("123 Main Street");
        c1.setPhone("690-555-1212");
        // Show objects created in the console
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // Create two instances of the PreferredCustomer class
        PreferredCustomer pc1 = new PreferredCustomer();
        PreferredCustomer pc2 = new PreferredCustomer("Julie James", "123 Main Street", "555-1212", "147-A049", true, 1750, 0.07);
        // Show object for the second PreferredCustomer
        System.out.println(pc2.toString());
    }

    /*
    Sample Run:

    Name: William James
    Address: 1456 Edgewater Street
    Telephone: 389-445-1312

    Name: Alex Matthew
    Address: 123 Bounty Drive
    Telephone: 123-445-1313

    Name: Julie James
    Address: 123 Main Street
    Telephone: 690-555-1212
    Customer Number: 147-A049
    Mailing List: NO

    Name: Xiao Xu
    Address: 67 Xiamen Sq
    Telephone: 530-213-5690
    Customer Number: 234-D082
    Mailing List: YES

    Name: Julie James
    Address: 123 Main Street
    Telephone: 555-1212
    Customer Number: 147-A049
    Mailing List: YES
    Purchases: $1750.00
    Discount Level: 0.07
     */
}
