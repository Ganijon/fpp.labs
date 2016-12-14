package lesson5.day1.lab2;

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        DeptEmployee[] department = new DeptEmployee[5];
        
        Professor prof1 = new Professor("Alice Black", LocalDate.of(2005, 5, 9), 8000.00);
        prof1.setNumberOfPublications(60);

        Professor prof2 = new Professor("Catherine Dove", LocalDate.of(2010, 3, 11), 7000.00);
        prof2.setNumberOfPublications(60);

        Professor prof3 = new Professor("Eric Freeds", LocalDate.of(2011, 7, 5), 6600.00);
        prof3.setNumberOfPublications(60);

        Secretary secretary1 = new Secretary("Geraldine Hendricks", LocalDate.of(2012, 2, 1), 5600.00);
        secretary1.setOvertimeHours(6);

        Secretary secretary2 = new Secretary("Ivan Johns", LocalDate.of(2004, 4, 5), 5400.00);
        secretary2.setOvertimeHours(4);

        department[0] = prof1;
        department[1] = prof2;
        department[2] = prof3;
        department[3] = secretary1;
        department[4] = secretary2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDo you wish to see the sum of all Professor salaries? [Y/N]");
        if ("Y".equals(scanner.next())) {
            double sum = 0;
            for (DeptEmployee employee : department) {
                if (employee instanceof Professor)
                    sum += employee.computeSalary();
            }
            System.out.println(String.format("Sum of all Professor salaries: $%,.2f", sum));
        }

        System.out.println("\nDo you wish to see the sum of all Secretary salaries? [Y/N]");
        if ("Y".equals(scanner.next())) {
            double sum = 0;
            for (DeptEmployee employee : department) {
                if (employee instanceof Secretary)
                    sum += employee.computeSalary();
            }
            System.out.println(String.format("Sum of all Secretary salaries: $%,.2f", sum));
        }

        System.out.println("\nDo you wish to see the sum of all salaries? [Y/N]");
        if ("Y".equals(scanner.next())) {
            double sum = 0;
            for (DeptEmployee employee : department) {
                sum += employee.computeSalary();
            }
            System.out.println(String.format("Sum of all salaries: $%,.2f", sum));
        }

    }
}
