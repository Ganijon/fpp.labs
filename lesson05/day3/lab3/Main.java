package lesson5.day3.lab3;

public class Main {
    
    public static void main(String... args) {
        
        Computer c1 = new Computer("Apple", "i5", 16, 512, 2.8);
        Computer c2 = new Computer("Dell", "i3", 4, 256, 2.4);
        Computer c3 = new Computer("Dell", "i3", 4, 256, 2.4);
        
        System.out.println("\nTEST toString");
        System.out.println("Computer 1: " + c1);
        System.out.println("Computer 2: " + c2);
        System.out.println("Computer 3: " + c3);
        
        System.out.println("\nTEST equals");
        System.out.println("Computer 1 and 2 are " + (c1.equals(c2) ? "equal.": "not equal." ));
        System.out.println("Computer 2 and 3 are " + (c2.equals(c3) ? "equal.": "not equal." ));
        
        System.out.println("\nTEST hashCode");
        System.out.println("Computer 1 hashcode: " + c1.hashCode());
        System.out.println("Computer 2 hashcode: " + c2.hashCode());
        System.out.println("Computer 3 hashcode: " + c3.hashCode());
    
        System.out.println("\nTEST clone [Deep Copy]");
        {
            Person_DeepCopy p1 = new Person_DeepCopy("Bob", c1);
            try {
                System.out.println("[Cloning...]");
                Person_DeepCopy p2 = (Person_DeepCopy)p1.clone(); 
                System.out.println("\t Original: " + p1);
                System.out.println("\t Clone:    " + p2);
    
                System.out.println("[Altering the clone...]");
                p2.name = "Tom";
                p2.computer.upgrade("i7", 32, 1024, 3.2);
                System.out.println("\t Original: " + p1);
                System.out.println("\t Clone:    " + p2);
            } 
            catch (CloneNotSupportedException ex) {
                System.out.println(ex.getMessage()); 
            }
        }

        System.out.println("\nTEST clone [Shallow Copy]");
        {
            Person_ShallowCopy p1 = new Person_ShallowCopy("Alice", c2);
            try {
                System.out.println("[Cloning...]");
                Person_ShallowCopy p2 = (Person_ShallowCopy)p1.clone(); 
                System.out.println("\t Original: " + p1);
                System.out.println("\t Clone:    " + p2);
    
                System.out.println("[Altering the clone...]");
                p2.name = "Harry";
                p2.computer.upgrade("i5", 8, 1024, 3.0);
                System.out.println("\t Original: " + p1);
                System.out.println("\t Clone:    " + p2);
            } 
            catch (CloneNotSupportedException ex) {
                System.out.println(ex.getMessage()); 
            }
        }

    }
}
