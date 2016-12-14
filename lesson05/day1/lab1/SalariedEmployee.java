package lesson5.day1.lab1;

class SalariedEmployee extends Employee {

    private double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(String name, String SSN, int age, Gender gender, String address, String phoneNumber) {
        super(name, SSN, age, gender, address, phoneNumber);
    }

    public void display() {
        super.display();
        System.out.println(String.format(" Annual Salary: $%,.2f", annualSalary));
    }
}
