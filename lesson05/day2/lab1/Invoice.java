package lesson5.day2.lab1;

class Invoice implements Payable {

    private final String partNumber;
    private String       partDescription;
    private int          quantity;
    private double       pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("INVOICE");
        sb.append("  Part Number:" + partNumber);
        sb.append("  Part Description:" + partDescription);
        sb.append("  Quantity:" + quantity);
        sb.append("  Price Per Item:$" + pricePerItem);
        return sb.toString();
    }
    
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}
