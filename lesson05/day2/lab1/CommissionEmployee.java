package lesson5.day2.lab1;

public class CommissionEmployee extends Employee {

    protected double grossSales;
    protected double commissionRate; // in percentage
    
    public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate) {
        super(firstName, lastName, SSN);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double setGrossSales(double value) {
        return grossSales = value;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double setCommissionRate(double value) {
        return commissionRate = value;
    }

    public String toString() {
        return String.format("%s  Gross Sales:$%s  Commission Rate:%s%% ", super.toString(), grossSales, commissionRate);
    }

    public double getPaymentAmount() {
        return grossSales * commissionRate;
    }
}
