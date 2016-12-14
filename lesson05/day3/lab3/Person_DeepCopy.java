package lesson5.day3.lab3;

public class Person_DeepCopy implements Cloneable {

    String name;
    Computer computer;
    
    public Person_DeepCopy(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
    }
    
    public Object clone() throws CloneNotSupportedException {
        Person_DeepCopy p = (Person_DeepCopy)super.clone();
        p.computer = (Computer)this.computer.clone();
        return p;
    }
    
    public String toString() {
        return String.format("%s's computer: %s", name, computer);
    }
}
