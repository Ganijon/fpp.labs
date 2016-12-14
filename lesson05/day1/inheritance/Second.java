package lesson5.day1.inheritance;

public class Second extends First {
    
    public Second() {

        super("param"); // call to super must be the 1st statement in constructor
        
        System.out.println("Sub Class Constructor");
    }
}
