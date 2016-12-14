package lesson03.lab34;

class Circle {
    
    public double getRadius() {
        return radius;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double computeArea() {
        return Math.PI * radius * radius;
    }
    
    private double radius;
}
