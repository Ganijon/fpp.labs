package lesson5.day1.lab2;

import java.time.LocalDate;

abstract class DeptEmployee {

    protected String    name;
    protected LocalDate hireDate;
    protected double    salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary() {
        return salary;
    }

    public DeptEmployee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }
}
