package lesson5.day2.lab1;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double setWeeklySalary(double value) {
        return weeklySalary = value;
    }

    public String toString() {
        return String.format("%s Weekly Salary:$%s", super.toString(), weeklySalary);
    }

    public double getPaymentAmount() {
        return weeklySalary;
    }

    private double weeklySalary;
}
