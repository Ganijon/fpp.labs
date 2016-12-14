package lesson5.day1.lab2;

import java.time.LocalDate;

class Professor extends DeptEmployee {

    protected int numberOfPublications;

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    public Professor(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }
}
