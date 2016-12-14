package lesson5.day2.lab1;

public abstract class Employee implements Payable {

    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("  First Name:" + firstName);
        sb.append("  Last Name:" + lastName);
        sb.append("  SSN:" + socialSecurityNumber);
        return sb.toString();
    }

    public abstract double getPaymentAmount();
}
