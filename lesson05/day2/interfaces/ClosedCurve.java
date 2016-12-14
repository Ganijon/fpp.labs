package lesson5.day2.interfaces;

/*
 * Interface rules up to Java 7
 */
public interface ClosedCurve {

    // All variables must be "public static final"
    public static final double d = 3.00;
    
    // If unspecified, default is "public static final" 
    String metrics = "cm";  
    final boolean t = true;    
    static int i = 1;
    public byte b = 2;
    
    // No constructors allowed in interfaces
    // interfaces can't be instantiated with new keyword
    // don't mix with anonymous class declaration
    
    // All methods must be "public abstract" instance methods
    // No static methods allowed 
    double computeArea();
    
    
}
