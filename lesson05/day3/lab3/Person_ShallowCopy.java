package lesson5.day3.lab3;

public class Person_ShallowCopy implements Cloneable {
    
    String name;
    Computer computer;
    
    public Person_ShallowCopy(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public String toString() {
        return String.format("%s's computer: %s", name, computer);
    }
}
