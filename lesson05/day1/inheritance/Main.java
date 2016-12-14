package lesson5.day1.inheritance;

public class Main {
    
    public static void main(String... args) {
        
        System.out.println("--Using super to call superclass constructor--");
        Third third = new Third();
  
        System.out.println("--Using super to overcome hiding--"); 
        
        B subObj = new B(1, 2);
        subObj.show();
        
        System.out.println("--Polymorphism--"); 
        A obj = new B(5,6);
        obj.show(); // calls method of actual type of obj - subclass B
        
        
        
        System.out.println("--Dynamic binding (or late binding)--");
        A[] items = new A[3];
        items[0] = new B(1,2);
        items[1] = new A(3);
        items[2] = new A(4);
        
        for(A a: items) {
            System.out.println("-" + a.getClass().getSimpleName());
            a.show(); 
            
        }
            
    }
}
