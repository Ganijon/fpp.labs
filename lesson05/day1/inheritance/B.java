package lesson5.day1.inheritance;

public class B extends A {
    
    int i; // this i hides the i in A (shadowing)
    
    B(int a, int b) {
        
        super(a);
        
        i = b;
    }
    
    // when marked with @Override method MUST override parent class method 
    // when not marked, it may OR may not override super class method
    @Override
    void show() {
          
        System.out.println("i in superclass A: " + super.i);
        System.out.println("i in subclass B: " + i);
    }
}
