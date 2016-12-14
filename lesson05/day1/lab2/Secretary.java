package lesson5.day1.lab2;

import java.time.LocalDate;

class Secretary extends DeptEmployee {

    protected double overtimeHours;

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Secretary(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public double computeSalary() {
        return salary + 12 * overtimeHours;
    }
}
