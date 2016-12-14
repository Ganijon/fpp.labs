package lesson5.day1.lab1;

public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    private double unionDues;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getUnionDues() {
        return unionDues;
    }

    public void setUnionDues(double unionDues) {
        this.unionDues = unionDues;
    }

    public HourlyEmployee(String name, String SSN, int age, Gender gender, String address, String phoneNumber) {
        super(name, SSN, age, gender, address, phoneNumber);
    }

    public void display() {
        super.display();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(" Hourly Rate: $%,.2f", hourlyRate));
        sb.append(String.format("\n Hours Worked: %shrs", hoursWorked));
        sb.append(String.format("\n Union Dues: $%,.2f", unionDues));
        System.out.println(sb.toString());
    }
}
