package lesson5.day2.interfaces;

class Triangle implements ClosedCurve {
    final double base;
    final double height;
    
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }
    
    public double computeArea() {
        return height * base / 2;    
    }
    
    public String toString() {
        return "Triange " + computeArea() + metrics; 
    }
}
