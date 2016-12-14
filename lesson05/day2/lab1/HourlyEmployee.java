package lesson5.day2.lab1;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double setWage(double value) {
        return wage = value;
    }

    public double getHours() {
        return hours;
    }

    public double setHours(double value) {
        return hours = value;
    }

    public String toString() {
        return String.format("%s  Wage:$%s  Hours:%s", super.toString(), wage, hours);
    }

    public double getPaymentAmount() {
        return wage * hours;
    }

    private double wage;
    private double hours;
}
