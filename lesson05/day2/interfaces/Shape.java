package lesson5.day2.interfaces;

/*
 * Interface rules in Java 8
 * 
 */
public interface Shape {
       
    // No constructors allowed in interfaces
    // interfaces can't be instantiated with new keyword
    // don't mix with anonymous class declaration
    
    
    // All variables must be "public static final"
    public static final double d = 3.00;
    
    // If unspecified, default is "public static final" 
    String metrics = "cm";  
    final boolean t = true;    
    static int i = 1;
    public byte b = 2;

    // Methods can be "public abstract" instance methods
    public abstract int publicAbstractMethod();
    
    // when unspecified it is "public abstract" method
    int unspecifiedPublicAbstractMethod(); 
    
    /* Not supported pre java 8
    // Methods with implementation are allowed in Java 8 higher
    // must be marked with "default" keyword
    default int defaultMethod(){
        return i * b;
    }

    // Static methods are allowed in Java 8 and higher
    static int staticMethod(){
        return i * b;
    }
    
    */
}
