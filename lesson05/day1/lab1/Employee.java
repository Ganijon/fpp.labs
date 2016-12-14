package lesson5.day1.lab1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Employee extends Person {

    protected String    department;
    protected String    jobTitle;
    protected LocalDate dateOfHire;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(int year, int month, int day) {
        this.dateOfHire = LocalDate.of(year, month, day);
    }

    public Employee(String name, String SSN, int age, Gender gender, String address, String phoneNumber) {
        super(name, SSN, age, gender, address, phoneNumber);
    }

    public void display() {
        super.display();
        StringBuilder sb = new StringBuilder();
        sb.append(" Department: " + department);
        sb.append("\n Job title: " + jobTitle);
        sb.append("\n Date of hire: ");
        sb.append(dateOfHire.format(DateTimeFormatter.ofPattern("MMMM d, YYYY")));
        System.out.println(sb.toString());
    }
}
