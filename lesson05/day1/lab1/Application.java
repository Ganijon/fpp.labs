package lesson5.day1.lab1;

public class Application {
    public static void main(String[] args) {

        Person[] people = new Person[4];

        Student s1 = new Student("Alex Brooks", "AB-0000", 29, Gender.MALE, 
                                "1 West St, Venice, AB 123456", "555-1122-3344");
        s1.setGPA(3.8);
        s1.setMajor("Arts");
        s1.setYearOfGraduation(2019);


        Employee e1 = new Employee("Chris Dudek", "CD-0001", 25, Gender.MALE, 
                                 "2 East St, Athens, CA 90291", "555-4455-6677");
        e1.setDepartment("Talent Development");
        e1.setJobTitle("Consultant");
        e1.setDateOfHire(2012, 9, 21);


        HourlyEmployee e2 = new HourlyEmployee("Eleanor Francis", "EF-0010", 22, Gender.FEMALE, 
                                       "3 South St, Rome, IL 80587", "555-8899-0011");
        e2.setDepartment("Research & Development");
        e2.setJobTitle("Software Engineer");
        e2.setDateOfHire(2011, 2, 1);
        e2.setHourlyRate(12);
        e2.setHoursWorked(56.0);
        e2.setUnionDues(3000.0);


        SalariedEmployee e3 = new SalariedEmployee("Glen Halden", "GH-0100", 32, Gender.FEMALE, 
                                         "4 North St, Madrid, CA 90291", "555-2233-4455");
        e3.setDepartment("Sales & Marketing");
        e3.setJobTitle("Unit Manager");
        e3.setDateOfHire(2014, 12, 1);
        e3.setAnnualSalary(60000.0);

     
        people[0] = s1;
        people[1] = e1;
        people[2] = e2;
        people[3] = e3;
        
     
        for (Person person : people) {
            person.display();
        }
    }
}
