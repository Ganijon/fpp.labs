package lesson03.lab34;

public class Triangle {
    
    public double getBase() {
        return base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double computeArea() {
        
        double area;
        
        if(base != 0 && height != 0) {
            // calculate traingle area with base & height
            // base is the longest side of the triangle
            area = base * height / 2;            
        }
        else {
            // calculate triangle area with Heron's formula
            // p is half-perimeter
            double p = (side1 + side2 + side3) / 2; 
            area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));    
        }
        return area;
    }
    
    private double base;    
    private double height;
    
    private double side1;    
    private double side2;
    private double side3;    
}

