package lesson5.day2.lab1;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, SSN, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double setBaseSalary(double value) {
        return baseSalary = value;
    }

    public String toString() {
        return String.format("%s  Base Salary:$%s", super.toString(), baseSalary);
    }

    public double getPaymentAmount() {
        return baseSalary + (grossSales * commissionRate);
    }


    private double baseSalary;
}
