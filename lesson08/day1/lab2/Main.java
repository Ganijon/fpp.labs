package lesson8.day1.lab2;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n - create an Arraylist for the class Marketing");
        List<Marketing> list = new ArrayList<>();
        System.out.println(list);
        
        System.out.println("\n - adding objects to the Marketing");
        list.add(new Marketing("Elene Frost", "Dell Alienware", 3150.0));
        list.add(new Marketing("Chloe Daine", "Dell Inspiron", 2400.0));
        list.add(new Marketing("Brook Cruze", "MS Surface", 3600.0));
        list.add(new Marketing("Helen Ivans", "Lenovo Thinkpad", 3150.0));
        list.add(new Marketing("Danil Evans", "HP Pavillion", 1800.0));
        list.add(new Marketing("Alice Brook", "Apple MacBook", 4000.0));
        list.add(new Marketing("Elene Frost", "Asus ROG", 2900.0));
        System.out.println(list);
        
        System.out.println("\n - delete objects from Marketing");
        list.remove(2);
        System.out.println(list);
        
        System.out.println("\n - modify some objects using set() method");
        list.set(1, new Marketing("Jamal Kumar", "Samsung Notebook 7", 1100.0));
        System.out.println(list);
        
        System.out.println("\n - sort according to the employee name and sales amount using comparator interface");
        list.sort(Marketing.BY_NAME_THEN_SALES);
        System.out.println(list);

        System.out.println("\n - display the contents in the list");
        System.out.println(list);
        
        System.out.println("\n - display the size of the list");
        System.out.println(list.size());
    }
}