// Child class that inherits from Person
public class Customer extends Person{
    private String customerNumber;
    private boolean receiveMail;
    // default constructor
    public Customer() {
    }
    // constructor with fields
    public Customer(String name, String address, String phone, String customerNumber, boolean receiveMail) {
        super(name, address, phone);
        this.customerNumber = customerNumber;
        this.receiveMail = receiveMail;
    }
    // getters and setters
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isReceiveMail() {
        return receiveMail;
    }

    public void setReceiveMail(boolean receiveMail) {
        this.receiveMail = receiveMail;
    }
    // helper method to display simple yes or no for mailing list boolean
    public String mailingListToString(boolean receiveMail){
        return receiveMail ? "YES" : "NO";
    }
    // toString method for displaying output
    @Override
    public String toString() {
        return super.toString() +
                "Customer Number: " + customerNumber + "\n" +
                "Mailing List: " + this.mailingListToString(receiveMail) + "\n";
    }
}
