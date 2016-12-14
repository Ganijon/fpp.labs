package lesson5.day2.lab2;

import java.util.Scanner;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super("Circle");
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public String toString() {
        return String.format("Shape is %s  radius is %s", super.toString(), radius);
    }

    public double computeArea() {
        return radius * radius * Math.PI;
    }

    public double computePerimeter() {
        return 2 * radius * Math.PI;
    }

    public void readShapeData() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the radius of Circle:");
        radius = Double.parseDouble(scanner.next());
    }
}
