// class that extends both Person and Customer (parent and grandparent)
public class PreferredCustomer extends Customer {
    private double purchaseTotal;
    private double discountLevel;

    // default constructor
    public PreferredCustomer(){

    }
    // Constructor using fields
    public PreferredCustomer(String name, String address, String phone, String customerNumber, boolean receiveMail, double purchaseTotal, double discountLevel) {
        super(name, address, phone, customerNumber, receiveMail);
        this.purchaseTotal = purchaseTotal;
        this.discountLevel = discountLevel;
    }
    // getters and setters
    public double getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(double purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }
    // toString method for displaying output
    @Override
    public String toString() {
        return super.toString() +
                "Purchases: " + "$" + String.format("%.2f", purchaseTotal) + "\n" +
                "Discount Level: " + discountLevel + "\n";
    }
}
